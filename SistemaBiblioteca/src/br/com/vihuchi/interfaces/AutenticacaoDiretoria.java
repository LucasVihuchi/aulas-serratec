package br.com.vihuchi.interfaces;

import br.com.vihuchi.excecoes.AutenticacaoException;

public interface AutenticacaoDiretoria extends Autenticacao {
	public abstract void autenticar(String login, String senha) throws AutenticacaoException;
}
