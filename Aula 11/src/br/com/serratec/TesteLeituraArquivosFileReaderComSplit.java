package br.com.serratec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteLeituraArquivosFileReaderComSplit {

	public static void main(String[] args) {
		File arquivo = new File("arquivoEscrita.txt");
		
		try {
			FileReader leitorArquivos = new FileReader(arquivo);
			BufferedReader leitorBffArquivos = new BufferedReader(leitorArquivos);
			
			String linhaLida;
			
			do {
				String linhaLidaAlt = leitorBffArquivos.readLine();
				if (linhaLidaAlt == null) {
					break;
				}
				System.out.println(linhaLidaAlt);
				mostraDadosConta(linhaLidaAlt);
				System.out.println("\n\n===========\n");
			} while(true);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("A leitura de arquivos não é possível");
		}

	}
	
	public static void mostraDadosConta(String contaString) {
		String[] contaVetor = contaString.split("¨");
		System.out.println("CPF do titular: " + contaVetor[0]);
		System.out.println("Agência da conta: " + contaVetor[1]);
		System.out.println("Número da conta: " + contaVetor[2]);
		System.out.println("Saldo da conta: " + contaVetor[3]);
	}

}
