package br.com.serratec;

public class TesteVetores {
	public static void main(String[] args) {
		final int QTD_NOTAS = 4;

		// 3 formas de declarar vetores
		int[] notasFomar1 = new int[QTD_NOTAS];
		int[] notasForma2 = new int[] {10, -4, 700, 546};
		int[] notasForma3 = {8, 6, 9, 3};
		
		//Percorrendo um vetor
		// Forma 1
		int tamanhoVetor = notasForma2.length;
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Nota do " + (i+1) + "° bimestre: " + notasForma2[i]);
		}
		
		System.out.println("\n\n===================\n");
		
		// Forma 2
		// for each nota in notas array
		// Para cada nota em vetor de notas
		int indice = 1;
		for(int notaAtual : notasForma3) {
			System.out.println("Nota do " + indice + "° bimestre: " + notaAtual);
			indice++;
		}
		
	}
}
