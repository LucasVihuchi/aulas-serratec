package br.com.vihuchi.excecoes;

public class CadastroInexistenteException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Cadastro não existe";
	}
	
}
