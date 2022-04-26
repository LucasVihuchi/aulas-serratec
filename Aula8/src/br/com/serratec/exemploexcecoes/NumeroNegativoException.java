package br.com.serratec.exemploexcecoes;

import java.util.InputMismatchException;

// Se extender de runtimeException será unchecked, caso contrário será checkhed
public class NumeroNegativoException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Números negativos não são aceitos";
	}
	
}
