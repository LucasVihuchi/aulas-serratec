package br.com.serratec;

import java.io.File;
import java.io.IOException;

public class TesteArquivos {

	public static void main(String[] args) {
		// Criando uma conexão com o arquivo
		File arquivo = new File("arquivo.txt");
		
		// exists() Verifica se um arquivo existe
		boolean arquivoExiste = arquivo.exists();
		
		if (!arquivoExiste) {
			try {
				arquivo.createNewFile();
				System.out.println("Arquivo criado com sucesso");
			} catch (IOException e) {
				System.out.println("Problemas de permissão na pasta. Finalizando o programa");
				System.exit(1);
			}
		}
		
		// Deleta um arquivo
		arquivo.delete();
		
		
		
		// Criando uma conexão com o arquivo que está dentro de uma pasta
		String separador = File.separator;
		File caminhoArquivoComPastas = new File("src" + separador + "br" + separador + "com" + separador + "serratec" + separador + "arquivos");
		File arquivoComPastas = new File(caminhoArquivoComPastas.getPath() + separador + "arquivo2.txt");
		
		// exists() Verifica se um arquivo existe
		boolean arquivoComPastasExiste = arquivoComPastas.exists();
		
		caminhoArquivoComPastas.mkdirs();
		
		if (!arquivoComPastasExiste) {
			try {
				arquivoComPastas.createNewFile();
				System.out.println("Arquivo 2 criado com sucesso");
			} catch (IOException e) {
				System.out.println("Problema durante a criação do arquivo. Finalizando o programa");
				System.exit(1);
			}
		}
		
		System.out.println("Caminho absoluto para o arquivo 2: " + arquivoComPastas.getAbsolutePath());
		System.out.println("Caminho relativo para o arquivo 2: " + arquivoComPastas.getPath());
		System.out.println("Espaço livre em disco: " + (arquivoComPastas.getFreeSpace() / 1024 / 1024 / 1024));
		System.out.println("Tamanho do arquivo: " + arquivoComPastas.length());
		
		
		
	}

}
