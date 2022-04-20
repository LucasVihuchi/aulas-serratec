package br.com.serratec.interfaces;

public interface AutenticacaoFuncionarios extends Autenticacao {
	boolean autenticarEmContaCliente(String senha, String numConta);
}
