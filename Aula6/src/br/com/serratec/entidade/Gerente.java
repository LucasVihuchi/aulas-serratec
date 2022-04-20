package br.com.serratec.entidade;

import br.com.serratec.interfaces.Autenticacao;

public class Gerente extends Funcionario implements Autenticacao{
	private String nivel;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public String toString() {
		return "Gerente [nivel=" + nivel + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public void aumentarSalario() {
		this.salario += 2000;
	}

	@Override
	public boolean autenticar(String senha) {
		return senha.equals("admin");
	}
	
	
}
