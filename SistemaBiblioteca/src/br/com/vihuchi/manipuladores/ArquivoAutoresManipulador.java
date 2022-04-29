package br.com.vihuchi.manipuladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.com.vihuchi.entidades.Autor;
import br.com.vihuchi.repositorios.AutorRepositorio;

public class ArquivoAutoresManipulador {

	// Loader - carregador
	public static void arquivoAutoresLoader() throws IOException {
		File arquivoAutores = new File("autores.csv");

		criaArquivoSeNecessario(arquivoAutores);

		FileReader leitorArquivo = null;
		leitorArquivo = new FileReader(arquivoAutores);

		BufferedReader leitorArquivoBff = new BufferedReader(leitorArquivo);

		do {
			String autorString = leitorArquivoBff.readLine();
			if (autorString == null) {
				break;
			}
			String[] autorVetor = autorString.split("¨");
			
			int idAutor = Integer.parseInt(autorVetor[0]);
			String nome = autorVetor[1];
			String descricao = autorVetor[2];
			Autor autor = new Autor(idAutor, nome, descricao);

			AutorRepositorio.adicionaAutor(autor);
		} while (true);
		
		leitorArquivo.close();
		leitorArquivoBff.close();
	}
	
	public static void adicionaAutor(Autor autor) throws IOException {
		File arquivoAutores = new File("autores.csv");

		criaArquivoSeNecessario(arquivoAutores);
		
		FileWriter escritorAutores = new FileWriter(arquivoAutores, true);
		BufferedWriter escritorAutoresBff = new BufferedWriter(escritorAutores);
		
		String linhaArquivoAutores = autor.getIdAutor() + "¨" + autor.getNome() + "¨" + autor.getDescricao();
		escritorAutoresBff.append(linhaArquivoAutores);
		escritorAutoresBff.newLine();
		
		escritorAutoresBff.flush();
		
		escritorAutores.close();
		escritorAutoresBff.close();

		AutorRepositorio.adicionaAutor(autor);
	}

	public static void criaArquivoSeNecessario(File arquivo) throws IOException {
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
	}
}
