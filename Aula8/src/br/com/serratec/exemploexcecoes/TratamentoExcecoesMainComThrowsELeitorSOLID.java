package br.com.serratec.exemploexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoesMainComThrowsELeitorSOLID {

	public static void main(String[] args) {
		try {
			Scanner leitor = new Scanner(System.in);

			int numero1 = lerInteiro(leitor, "Insira o primeiro número: ");
//			leitor.close();
			int numero2 = lerInteiro(leitor, "Insira o segundo número: ");

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
	
	public static int lerInteiro(Scanner leitor, String mensagemLeitura) {
		int numero = 0;
		do {
			System.out.print(mensagemLeitura);
			try {
				numero = leitor.nextInt();
				if (numero < 0) {
					// Throw lança nova exceção
					throw new NumeroNegativoException();
				}
				break;
			// Catch mais específicos devem vir primeiro do que os mais gerais
			} catch (InputMismatchException ie) {
				System.out.println("Insira um número. Outros caracteres não são aceitos");
			} catch (NumeroNegativoException ne) {
				System.out.println("Insira um número não negativo");
				System.exit(1);
			} catch (Exception e) {
				System.out.println("Alguma coisa aconteceu");
			} finally {
				// Executado se a exceção estourar ou não
				leitor.nextLine();
			}
		} while (true);
		return numero;
	}

}
