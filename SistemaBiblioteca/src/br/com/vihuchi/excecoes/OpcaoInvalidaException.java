package br.com.vihuchi.excecoes;

public class OpcaoInvalidaException extends Exception {

	@Override
	public String getMessage() {
		return "Opção inválida";
	}

}
