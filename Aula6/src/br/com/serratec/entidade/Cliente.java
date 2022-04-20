package br.com.serratec.entidade;

import br.com.serratec.interfaces.Autenticacao;
import br.com.serratec.interfaces.Emprestimo;

public class Cliente implements Autenticacao, Emprestimo {
	private String nome;
	private String endereco;
	private String numeroConta;
	
	public Cliente(String nome, String endereco, String numeroConta) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", numeroConta=" + numeroConta + "]";
	}

	@Override
	public boolean autenticar(String senha) {
		return senha.equals("123");
	}

	@Override
	public boolean pedirEmprestimo(double valor) {
		return valor < 10000;
	}
}
