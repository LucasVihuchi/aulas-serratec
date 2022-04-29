package br.com.serratec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteLeituraArquivosFileReader {

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
			} while(true);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("A leitura de arquivos não é possível");
		}

	}
	
	

}
