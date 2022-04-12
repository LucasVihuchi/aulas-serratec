package exercicios;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		// enquanto
		int numeroBase = 8;
		
		Scanner leitor = new Scanner(System.in);
		
		String parar = "S";
		int indice = 0;
		
//		do {
//			System.out.println(numeroBase + " x " + indice + " = " + (numeroBase * indice));
//			System.out.print("Deseja parar? (S/N) ");
//			parar = leitor.nextLine().toUpperCase();
//			indice++;
//		} while (!parar.equals("S"));
		
		do {
			System.out.println(numeroBase + " x " + indice + " = " + (numeroBase * indice));
			System.out.print("Deseja parar? (S/R/N) ");
			parar = leitor.nextLine().toUpperCase();
			if (parar.equals("R")) {
				continue;
			}
			
			indice++;
			
			if (parar.equals("S")) {
				break;
			}
		} while (true);
	}
}
