package br.com.vihuchi.excecoes;

public class DocumentoInvalidoException extends Exception {

	@Override
	public String getMessage() {
		return "Documento inválido!";
	}
	
}
