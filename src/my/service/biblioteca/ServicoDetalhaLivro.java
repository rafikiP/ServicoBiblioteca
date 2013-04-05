package my.service.biblioteca;

import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cyberneko.html.HTMLEntities;

import my.service.biblioteca.objetos.DetalhesLivro;
import my.service.biblioteca.parsers.ParserDetalhe;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


@Path("/detalhes")
public class ServicoDetalhaLivro {

	@GET
	@Path("/{param}")
	@Produces({ MediaType.APPLICATION_JSON })
	public DetalhesLivro  getDetalhes(@PathParam("param") String idLivro) throws Exception{
		
		String urlLocalizacao = "http://www.pergamum.bib.ufba.br/pergamum/biblioteca/index.php?tipo_pesquisa=&rs=ajax_conteudo_pastas&rsargs[]=" + idLivro;
		String urlDetalhes = "http://www.pergamum.bib.ufba.br/pergamum/biblioteca/index.php?rs=ajax_dados_acervo&rst=&rsargs[]=" + idLivro;
		HtmlPage pageDetalhes, pageLocalizacao;
		
		//Instancia um browser cliente
		final WebClient webClient = new WebClient();
	    
		//Requisita a primeira página para obter o cookie
		webClient.getPage("http://www.pergamum.bib.ufba.br/");
		
		
		//Requisita a página de detalhes para obter os detalhes
	    pageDetalhes = webClient.getPage(urlDetalhes);
	    pageLocalizacao = webClient.getPage(urlLocalizacao);
		
	    //Objeto a ser retornado
	    DetalhesLivro detalhesLivro = new DetalhesLivro();
	    //Instância do parser
	    ParserDetalhe parser = new ParserDetalhe(pageDetalhes);
	    
	    detalhesLivro.setEditora(parser.extraiEditora());
	    detalhesLivro.setTitulo(parser.extraiTitulo());
	    detalhesLivro.setDisponibilidades(parser.extraiBibliotecaDisponibilidade(pageLocalizacao));
	    
	    
	    return detalhesLivro;
	}

}