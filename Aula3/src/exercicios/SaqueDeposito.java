package exercicios;

import java.util.Scanner;

public class SaqueDeposito {
	public static void main(String[] args) {
		Conta conta0 = new Conta();
		
		Conta conta1 = new Conta("Lucas", 1234564.6);
		
		Conta conta2 = new Conta("Gabriel", 33333.3, "1221512dsgewy4");
		
//		conta1.setTitular("Manuel");
//		conta1.setNumero(2512512.4);
		
		Scanner leitor = new Scanner(System.in);
		lidarComDeposito(conta1, leitor);

		lidarComSaque(conta1, leitor);
		
	    lidarComDeposito(conta1, leitor);
	}
	
	public static void lidarComDeposito(Conta conta, Scanner leitor) {
		System.out.print("Insira o valor de depósito: ");
		double valorInserido = leitor.nextDouble();
		conta.depositar(valorInserido);
		conta.imprimirSaldo();
	}
	
	public static void lidarComSaque(Conta conta, Scanner leitor) {
		System.out.print("Insira o valor de saque: ");
		double valorInserido = leitor.nextDouble();
		boolean conseguiuSacar = conta.sacar(valorInserido);
	    if (conseguiuSacar) {
	    	System.out.println("Saque realizado com sucesso");
	    	conta.imprimirSaldo();
	    }
	    else {
	    	System.out.println("Saque não realizado. Saldo insuficiente");
	    	conta.imprimirSaldo();
	    }
	}
}
