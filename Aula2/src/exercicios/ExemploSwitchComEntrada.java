package exercicios;

import java.util.Scanner;

public class ExemploSwitchComEntrada {

	public static void main(String[] args) {
		// inteiro opcao = leia()
		
		// Instanciando scanner para possibilitar leitura (Só 1 vez por função)
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a opção desejada: ");
		int opcao;
		// Lê um valor inteiro do teclado
		opcao = leitor.nextInt();
		
		System.out.print("Insira seu nome: ");
//		String nomeUsuario = leitor.next();
//		String sobrenomeUsuario = leitor.next();
		leitor.nextLine();
		String nomeUsuario = leitor.nextLine();
		
		leitor.close();
		
		Scanner leitor2 = new Scanner(System.in);
		
		// escolha (opcao)
		// 		caso 1:
		switch (opcao) {
			case 1:
				System.out.println("Parabéns! Você selecionou o 1, " + nomeUsuario);
				// pare
				break;
			case 2:
				System.out.println("Você selecionou o 2, " + nomeUsuario);
				break;
			// caso contrario
			default: 
				System.out.println("Opção inválida. Parando o programa, " + nomeUsuario);
				System.exit(0);
				break;
		}
	}
}
