package br.com.vihuchi.interfaces;

import br.com.vihuchi.excecoes.AutenticacaoException;

public interface Autenticacao {
	public abstract void autenticar(String login) throws AutenticacaoException;
}
