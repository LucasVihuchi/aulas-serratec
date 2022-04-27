package br.com.vihuchi.excecoes;

public class EstoqueInsuficienteException extends Exception {

	@Override
	public String getMessage() {
		return "Estoque insuficiente";
	}

}
