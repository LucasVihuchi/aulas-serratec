package br.com.vihuchi.validadores;

import br.com.vihuchi.excecoes.DocumentoInvalidoException;

public class ValidadorDocumento {
	public static String validarCpf(String cpf) throws DocumentoInvalidoException {
		if(cpf.length() != 11) {
			throw new DocumentoInvalidoException();
		}
		return cpf;
	}
}
