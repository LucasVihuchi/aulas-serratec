package br.com.vihuchi;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.vihuchi.entidades.Autor;
import br.com.vihuchi.entidades.Bibliotecario;
import br.com.vihuchi.entidades.Livro;
import br.com.vihuchi.enums.GeneroLivro;
import br.com.vihuchi.excecoes.DocumentoInvalidoException;
import br.com.vihuchi.excecoes.EnumInexistenteException;

public class SistemaBiblioteca {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		Bibliotecario b1;
		try {
			b1 = new Bibliotecario("João", "11122233344", "2422446688", "2020030001");
			mostraMenuInicial(leitor, b1);
		} catch (DocumentoInvalidoException e) {
			System.out.println("Documento inválido. Execute o programa de novo");
		}

	}

	public static void mostraMenuInicial(Scanner leitor, Bibliotecario usuarioAtivo) {
		int opcao = lerOpcao(leitor, 4, "1 - Cadastrar livro" + "\n2 - Cadastrar autor" + "\n3 - Alugar livro"
				+ "\n4 - Devolver livro" + "\n0 - Sair" + "\nInsira sua escolha: ");

		switch (opcao) {
		case 1:
			handleCadastrarLivro(leitor, usuarioAtivo);
			break;
		case 2:
			System.out.println("Chama cadastro autor");
			break;
		case 3:
			System.out.println("Alugar livro");
			break;
		case 4:
			System.out.println("Devolver livro");
			break;
		default:
			System.out.println("Sair");
			System.exit(0);
		}
	}

	public static void handleCadastrarLivro(Scanner leitor, Bibliotecario usuarioAtivo) {
		System.out.print("Insira o id do livro: ");
		int id = leitor.nextInt();
		leitor.nextLine();

		System.out.print("Insira o titulo do livro: ");
		String titulo = leitor.nextLine();
		
		System.out.print("Insira a edicao do livro: ");
		String edicao = leitor.nextLine();

		GeneroLivro generoLivro;
		do {
			System.out.print("Insira o genero do livro: ");
			String genero = leitor.nextLine();
			try {
				generoLivro = GeneroLivro.getGeneroPorNomeAmigavel(genero);
				break;
			} catch (EnumInexistenteException e) {
				System.out.println("O gênero inserido não existe. Tente de novo");
			}
		} while (true);
		
		// Cena dos capitulos de amanhã
		System.out.println("Insira o autor do livro: ");
		Autor autor = new Autor(1, "Stephen King", "Cara que escreveu uns livros maneiros");
		
		System.out.print("Insira a quantidade em estoque do livro: ");
		int qtdEtoque = leitor.nextInt();
		leitor.nextLine();
		
		Livro l1 = usuarioAtivo.cadastrarLivro(id, titulo, edicao, generoLivro, autor, qtdEtoque);
		
		System.out.println("Livro cadastro: " + l1);
	}

	public static int lerOpcao(Scanner leitor, int opcaoMaxima, String textoPrevio) {
		int opcao;

		do {
			System.out.print(textoPrevio);
			try {
				opcao = leitor.nextInt();
				if (opcao >= 0 && opcao <= opcaoMaxima) {
					break;
				}
				System.out.println("Opção fora da faixa");
			} catch (InputMismatchException ex) {
				System.out.println("Opção inválida");
			} finally {
				// Limpa o buffer da entrada (teclado)
				leitor.nextLine();
			}
		} while (true);

		return opcao;
	}

}
