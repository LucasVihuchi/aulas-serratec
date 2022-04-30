package br.com.vihuchi.manipuladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import br.com.vihuchi.entidades.Autor;
import br.com.vihuchi.entidades.Bibliotecario;
import br.com.vihuchi.entidades.Livro;
import br.com.vihuchi.enums.GeneroLivro;
import br.com.vihuchi.excecoes.DocumentoInvalidoException;
import br.com.vihuchi.excecoes.EnumInexistenteException;
import br.com.vihuchi.repositorios.AutorRepositorio;
import br.com.vihuchi.repositorios.LivroRepositorio;

public class ArquivoLivrosManipulador {
	// Loader - Carregar de dados do arquivo para o mapa(HashMap)
	// Adicionar - Adicionar um novo livro ao arquivo de livros
	
	public static void arquivoLivrosLoader() {
		// 1º Criar conexão com o arquivo
		// 2º Verifica se o arquivo existe, se não existir, cria o arquivo
		// 3º Declaramos os objetos de leitura do arquivo
		// 4º Loop para ler todos as linhas do arquivos e ir criando os livros
		// 5ª Fecha os leitores de arquivo
		
		// Passo 1
		File arquivoLivros = new File("livros.csv");
//		String separador = File.separator;
//		File caminhoArquivoLivros = new File("src" + separador +"isso" + separador + "aquilo");
//		File arquivoLivros = new File(caminhoArquivoLivros.getAbsolutePath() + separador+ "livros.csv");
		
		// Passo 2
		criaArquivoSeNecessario(arquivoLivros);
		
		// Passo 3
		// Passo 5 - É implicito pela forma que fizemos o try
		try (FileReader leitorArquivoLivros = new FileReader(arquivoLivros);
			BufferedReader leitorArquivosBffLivros = new BufferedReader(leitorArquivoLivros)) {
			
			// Passo 4
			do {
				String livroLido = leitorArquivosBffLivros.readLine();
				if (livroLido == null) {
					break;
				}
				String[] livroLidoVetor = livroLido.split("¬");
				
				// 1¬Dom Casmurro¬Romance¬4¬Edicao alguma¬2021-03-21¬32¬4¬1
				
				int id = Integer.parseInt(livroLidoVetor[0]);
				String titulo = livroLidoVetor[1];
				GeneroLivro genero = GeneroLivro.getGeneroPorNomeAmigavel(livroLidoVetor[2]);
				int idAutor = Integer.parseInt(livroLidoVetor[3]);
				Autor autor = AutorRepositorio.retornaAutor(idAutor);
				String edicao = livroLidoVetor[4];
				LocalDate dataPublicacao = LocalDate.parse(livroLidoVetor[5]);
				int qtdEtoque = Integer.parseInt(livroLidoVetor[6]);
				int qtdAlugados = Integer.parseInt(livroLidoVetor[7]);
				// Gambiarra porque não temos repositório de bibliotecarios, mas o correto seria fazer igual ao autor
				Bibliotecario b1 = new Bibliotecario("Heitor", "12345678900", "2422334455", "20200103");
				
				Livro l1 = new Livro(id, titulo, edicao, genero, autor, b1, qtdEtoque, dataPublicacao, qtdAlugados);
				LivroRepositorio.adicionaLivro(l1);
				System.out.println("Livro: " + l1);
			} while(true);
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado. Finalizando a execução");
			System.exit(1);
		} catch (IOException e1) {
			System.out.println("Problema ao criar os leitores de arquivos");
			System.exit(1);
		} catch (EnumInexistenteException e) {
			System.out.println("Enum inexistente");
		} catch (DocumentoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void adicionaLivro() {
		// TODO: Implementar método
	}
	
	public static void criaArquivoSeNecessario(File arquivo) {
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Problema ao criar novo arquivo");
				System.exit(1);
			}
		}
	}
}
