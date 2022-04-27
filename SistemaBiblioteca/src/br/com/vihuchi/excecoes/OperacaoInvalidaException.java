package br.com.vihuchi.excecoes;

public class OperacaoInvalidaException extends Exception {

	@Override
	public String getMessage() {
		return "Operação não permitida";
	}
	
}
