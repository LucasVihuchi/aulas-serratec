package br.com.vihuchi.entidades;

import br.com.vihuchi.excecoes.NumeroNegativoException;

public final class Autor {
	// Static é da classe e não de um objeto específico
	static private int totalAutoresCadastrados;	
	
	private int idAutor;
	private String nome;
	private String descricao;
	
	public Autor(int idAutor, String nome, String descricao) {
		// Aumenta o número de autores toda vez que um é criado
		this.idAutor = idAutor;
		this.nome = nome;
		this.descricao = descricao;
		System.out.println("Autor criado com sucesso");
		Autor.totalAutoresCadastrados++;
	}
	
	public int getIdAutor() {
		return idAutor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static int getTotalAutoresCadastrados() {
		return totalAutoresCadastrados;
	}

	public static void diminuiAutores() {
		if (Autor.totalAutoresCadastrados <= 0) {
			throw new NumeroNegativoException();
		}
		Autor.totalAutoresCadastrados--;
	}
}
