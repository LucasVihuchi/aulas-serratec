package br.com.serratec.exemploexcecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TratamentoExcecoesChecked {

	public static void main(String[] args) {
		
		try {
			lerArquivo();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo");
		}
	}
	
	// Nas exceções do tipo checked é obrigatório o throws
	public static void lerArquivo() throws FileNotFoundException {
		File arquivo = new File("arquivo.txt");

	}

}
