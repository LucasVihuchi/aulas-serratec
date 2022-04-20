package br.com.serratec.interfaces;

public interface Emprestimo {
	boolean pedirEmprestimo(double valor);
	
	static void verSaldoDisponivelNoBanco() {
		System.out.println("O saldo disponível é R$ 2.000.000,00");
	}
}
