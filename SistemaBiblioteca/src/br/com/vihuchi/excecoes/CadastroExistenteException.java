package br.com.vihuchi.excecoes;

public class CadastroExistenteException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Cadastro já existe";
	}
	
}
