package my.service.biblioteca;

import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class DetalhesLivro {
 
	private String localizacao;
	private String autor;
	private String titulo;
	private String editora;
	
	private int qtdDisponivel;
	
	public DetalhesLivro(){
		super();
	}

	public DetalhesLivro(String localizacao, String autor, String titulo,
			String editora, int qtdDisponivel) {
		
		this.localizacao = localizacao;
		this.autor = autor;
		this.titulo = titulo;
		this.editora = editora;
		this.qtdDisponivel = qtdDisponivel;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getQtdDisponivel() {
		return qtdDisponivel;
	}

	public void setQtdDisponivel(int qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}
	
	
	
 
}