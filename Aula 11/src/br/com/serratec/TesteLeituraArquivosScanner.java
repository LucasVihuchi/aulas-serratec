package br.com.serratec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraArquivosScanner {

	public static void main(String[] args) {
		File arquivo = new File("arquivoEscrita.txt");
		
		try {
			Scanner leitorArquivos = new Scanner(arquivo);
			
			
			while(leitorArquivos.hasNext()) {
				System.out.println(leitorArquivos.nextLine());
			}
			
			// Close é MUUUUITO importante para arquivos
			leitorArquivos.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não existe");
		}
	}

}
