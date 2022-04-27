package br.com.vihuchi.entidades;

import br.com.vihuchi.excecoes.AutenticacaoException;
import br.com.vihuchi.excecoes.DocumentoInvalidoException;

public final class Frequentador extends Usuario {
	private static int totalFrequentadoresCadastrados;
	
	private final String numRegistro;
	
	public Frequentador(String nome, String cpf, String telefone, String numRegistro) throws DocumentoInvalidoException {
		super(nome, cpf, telefone);
		this.numRegistro = numRegistro;
		System.out.println("Frequentador criado com sucesso");
		Frequentador.totalFrequentadoresCadastrados++;
	}
	
	@Override
	public void autenticar(String login) throws AutenticacaoException {
		if(!this.numRegistro.equals(login)) {
			throw new AutenticacaoException();
		}
	}

	public String getNumRegistro() {
		return numRegistro;
	}

	public static int getTotalFrequentadoresCadastrados() {
		return totalFrequentadoresCadastrados;
	}
}
