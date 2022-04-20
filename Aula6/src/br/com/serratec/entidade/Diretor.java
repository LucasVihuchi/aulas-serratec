package br.com.serratec.entidade;

import br.com.serratec.interfaces.AutenticacaoFuncionarios;

public class Diretor extends Funcionario implements AutenticacaoFuncionarios {
	private String categoria;

	public Diretor(String nome, double salario, String categoria) {
		super(nome, salario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Diretor [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", categoria=" + categoria + "]";
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public void aumentarSalario() {
		this.salario += 5000;
	}

	@Override
	public boolean autenticar(String senha) {
		return senha.equals("geladeira");
	}

	@Override
	public boolean autenticarEmContaCliente(String senha, String numConta) {
		return senha.equals("geladeira") && numConta.equals("123");
	}
}
