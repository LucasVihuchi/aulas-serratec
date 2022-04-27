package br.com.vihuchi.excecoes;

public class EnumInexistenteException extends Exception {

	@Override
	public String getMessage() {
		return "Enum não encontrado!";
	}
	
}
