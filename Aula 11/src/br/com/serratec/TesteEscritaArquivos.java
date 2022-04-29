package br.com.serratec;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaArquivos {

	public static void main(String[] args) {
		File arquivo = new File("arquivoEscrita.txt");
		
		if (!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Ocorreu um erro durante a criação do arquivo");
			}
		}
		
		
//		try {
//			// true - Entra no modo de adição de texto, em vez do modo de sobreescrita
//			FileWriter escritorArquivo = new FileWriter(arquivo, true);
//			
//			// Write reescreve o arquivo toda vez
//			escritorArquivo.write("teste");
//			escritorArquivo.write("125125");
//			
//			// Append adicionar ao conteúdo atual, um texto
//			escritorArquivo.append("textão muito grande");
//			
//			// Limpa a fila de texto
//			escritorArquivo.flush();
//			
//			escritorArquivo.append("125125");
//			
//			System.out.println("Endoing usado: " + escritorArquivo.getEncoding());
//			
//			escritorArquivo.close();
//		} catch (IOException e) {
//			System.out.println("Ocorreu um erro durante a escrita do arquivo");
//		}
		
		
		// Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos.
		
		// File Writer
		// Puxar para memória: Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos.
		// Salvar: Lorem Ipsum é simplesmente uma simulação de texto da indústria tipo
		
		// Buffered Writer
		// Puxar para buffer: "Lorem Ipsum é simplesmente", "uma simulação de" ,"texto da indústria tipográfica"
		// Salvar com File Writer: Lorem Ipsum é simplesmente
		// Salvar com File Writer: Lorem Ipsum é simplesmente uma simulação de
		// Salvar com File Writer: Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica
		// Puxar para buffer: " e de impressos."
		// Salvar com File Writer: Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos.
		
		
		
		try {
			FileWriter escritorArquivo = new FileWriter(arquivo, true);
			BufferedWriter escritorBffArquivo = new BufferedWriter(escritorArquivo);
			
			escritorBffArquivo.write("12345678900¨0001¨12345¨657.89");
			// Quebra de linha
			escritorBffArquivo.newLine();
			escritorBffArquivo.write("33355566688¨0001¨89762¨7894.09");
			escritorBffArquivo.newLine();
			
			
			// Força a limpeza do buffer antes de continuar
			escritorBffArquivo.flush();
			
			escritorBffArquivo.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro durante a escrita do arquivo");
		}
		

	}

}
