package br.com.serratec.exemploexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoesMainComThrowsELeitor {

	public static void main(String[] args) {
		try {
			Scanner leitor = new Scanner(System.in);

			
			System.out.print("Insira o primeiro número: ");
			int numero1 = leitor.nextInt();

			leitor.close();
			int numero2 = 0;

			do {
				System.out.print("Insira o segundo número: ");
				try {
					numero2 = leitor.nextInt();
					break;
				} catch (InputMismatchException ie) {
					System.out.println("Insira um número. Outros caracteres não são aceitos");
				} finally {
					// Executado se a exceção estourar ou não
					leitor.nextLine();
				}
			} while (true);

			// Tratamento para divisão por 0
			try {
				double resultado = dividir(numero1, numero2);
				System.out.println("Resultado divisão: " + resultado);
			} catch (ArithmeticException excecaoMat) {
				System.out.println("Valor inválido. Texto da Exceção: " + excecaoMat.getMessage());
			}
		}
		catch (IllegalStateException iStateExc) {
			fecharPrograma("\nO scanner está fechado. Não consigo continuar :(");			
		}
		
	}

	public static int dividir(int n1, int n2) throws ArithmeticException {
		return n1 / n2;
	}
	
	public static void fecharPrograma(String textoFechamentoPrograma) {
		System.out.println(textoFechamentoPrograma);
		System.exit(1);
	}

}
