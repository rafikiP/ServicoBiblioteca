package my.service.biblioteca.objetos;

public class Disponibilidade {
	
	private String nomeBiblioteca;
	private String localizacaoEstante;
	private int qtdDisponivel;
	private int qtdEsprestado;
	private int qtdExemplarConsulta;
	
	
	public Disponibilidade(){
		super();
	}
	
	public Disponibilidade(String nomeBiblioteca, String localizacaoEstante,
			int qtdDisponivel, int qtdEsprestado, int qtdExemplarConsulta) {
		
		super();
		this.nomeBiblioteca = nomeBiblioteca;
		this.localizacaoEstante = localizacaoEstante;
		this.qtdDisponivel = qtdDisponivel;
		this.qtdEsprestado = qtdEsprestado;
		this.qtdExemplarConsulta = qtdExemplarConsulta;
	}
	
	
	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}
	public void setNomeBiblioteca(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}
	public String getLocalizacaoEstante() {
		return localizacaoEstante;
	}
	public void setLocalizacaoEstante(String localizacaoEstante) {
		this.localizacaoEstante = localizacaoEstante;
	}
	public int getQtdDisponivel() {
		return qtdDisponivel;
	}
	public void setQtdDisponivel(int qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}
	public int getQtdEsprestado() {
		return qtdEsprestado;
	}
	public void setQtdEsprestado(int qtdEsprestado) {
		this.qtdEsprestado = qtdEsprestado;
	}
	public int getQtdExemplarConsulta() {
		return qtdExemplarConsulta;
	}
	public void setQtdExemplarConsulta(int qtdExemplarConsulta) {
		this.qtdExemplarConsulta = qtdExemplarConsulta;
	}
	
	
	
}
