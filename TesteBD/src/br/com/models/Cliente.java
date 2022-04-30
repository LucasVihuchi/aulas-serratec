package br.com.models;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	
	
	
	public Cliente(int id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}	
}
