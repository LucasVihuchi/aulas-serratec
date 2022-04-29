package br.com.serratec;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteEscritaBionarios {

	public static void main(String[] args) {
		try {
			FileOutputStream arquivo = new FileOutputStream("teste.dat");
			DataOutputStream escritorArquivos = new DataOutputStream(arquivo);
			
			escritorArquivos.writeChars("Texto legalzinho aqui");
			
			escritorArquivos.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não existe");
		} catch (IOException e) {
			System.out.println("Problema escrita de arquivos");
		}
		

	}

}
