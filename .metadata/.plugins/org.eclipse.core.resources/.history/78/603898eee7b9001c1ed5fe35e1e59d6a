package exercicios;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		// enquanto
		int numeroBase = 8;
		
		Scanner leitor = new Scanner(System.in);
		
		String parar = "N";
		int indice = 0;
		while (!parar.equals("S")) {
			System.out.println(numeroBase + " x " + indice + " = " + (numeroBase * indice));
			System.out.print("Deseja parar? (S/N) ");
			parar = leitor.nextLine().toUpperCase();
			indice++;
		}
	}
}
