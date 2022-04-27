package br.com.vihuchi.excecoes;

// Vai extender de runtimeException se não quiser obrigar a tratar a exceção (unchecked)
// Vai extender de Exception se qiuser forçar o tratamento (checked)
public class NumeroNegativoException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Número negativo não permitido";
	}
	
}
