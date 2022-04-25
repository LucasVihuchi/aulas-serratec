package br.com.serratec.exemploexcecoes;

import java.util.Scanner;

public class TratamentoExcecoesMain {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		int numero1 = leitor.nextInt();
		
		System.out.print("Insira o segundo número: ");
		int numero2 = leitor.nextInt();
		
		
		double resultado = dividir(numero1, numero2);
		System.out.println("Resultado divisão: " + resultado);

	}
	
	public static int dividir(int n1, int n2) {
		// Tudo que vai dentro do try será colocado para tratamento
		try {
			return n1 / n2;			
		}
		// Catch - Significa pegar
		// Catch pode ser super generico e pegar qualquer exceção. Exemplo:
//		catch (Exception excecao) {
//			System.out.println("Esse tipo de divisão não pode ser feito");
//			return 0;
//		}
		catch (ArithmeticException excecaoAritmetica) {
			System.out.println("Esse tipo de divisão não pode ser feito");
			return 0;
		}
		
	}

}
