package br.com.serratec;

public class TesteMatrizes {
	public static void main(String[] args) {
		
		// 3 formas de declarar matrizes
		int[][] coordenadasForma1 = new int[3][2];
		int[][] coordenadasForma2 = new int[][] {{2, 1}, 
												 {4, 5}, 
												 {3, 9}};
		int[][] coordenadasForma3 = {{8, 9}, 
									 {2, 5}, 
									 {1, 2}};
		
		// Forma 1
		int tamanhoPrimeiroColchete = coordenadasForma2.length;
		for(int i = 0; i < tamanhoPrimeiroColchete; i++) {
			int tamanhoSegundoColchete = coordenadasForma2[i].length;
			for(int j = 0; j < tamanhoSegundoColchete; j++) {
				System.out.print(coordenadasForma2[i][j] + ", ");
			}
			System.out.println("");
		}
		
		System.out.println("\n\n===========\n");
		
		for(int[] linhaAtual : coordenadasForma3) {
			for(int numeroAtual : linhaAtual) {
				System.out.print(numeroAtual + ", ");
			}
			System.out.println("");
		}
	}
}
