package my.service.biblioteca;

import javax.swing.text.html.HTML;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


@Path("/detalhes")
public class ServicoDetalhaLivro {

	@GET
	@Path("/{param}")
	@Produces({ MediaType.TEXT_HTML })
	public String  getDetalhes(@PathParam("param") String idLivro) throws Exception{
		
		String url = "http://www.pergamum.bib.ufba.br/pergamum/biblioteca/index.php?tipo_pesquisa=&rs=ajax_conteudo_pastas&rsargs[]=" + idLivro;
		
		//Instancia um browser cliente
		final WebClient webClient = new WebClient();
	    
		//Requisita a primeira página para obter o cookie
		HtmlPage page = webClient.getPage("http://www.pergamum.bib.ufba.br/");
		//Requisita a página de detalhes para obter os detalhes
	    page = webClient.getPage(url);
		
	    return  "<html> " + "<title>" + "Hello Jersey" + "</title>"
        + "<body><h1>" +new ParserDetalhe(page).extraiBibliotecaDisponibilidade(page) + "</body></h1>" + "</html> ";
	    
		//return page;
		

//		DetalhesLivro detalhes = new DetalhesLivro(
//				"004 Biblioteca Universitária Reitor Macedo Costa",
//				"Simpósio Brasileiro de Banco de Dados (4.: 1989: Campinas).",
//				"4. Simposio Brasileiro de Banco de Dados, 5 a 7 de abril de 1989. -",
//				"Campinas, SP : [s.n.], 1989.", 1);
//
//		return detalhes;

	}

}