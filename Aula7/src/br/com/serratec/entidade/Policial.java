package br.com.serratec.entidade;

public class Policial {
	protected String nome;
	protected String registro;

	public Policial(String nome, String registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	public final void registrarPrisao(String suspeito) {
		System.out.println("O policial " + this.nome + 
				" efeutou a prisão de " + suspeito );
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	
}
