package br.com.serratec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TesteLista {
	public static void main(String[] args) {
		// Tem tamanho variavel
		// Permite elementos duplicados
		// Mantém a ordem dos elementos
		// Permite tipos(String, int, Aluno) diferente dentro da mesma lista
		
		List minhaListaAleatoria = new ArrayList();
		
		// Add - Adiciona um item no fim da lista
		
		// NÃO FAÇA ISSO AQUI, PORQUE TÁ ERRADO!!!!!
		minhaListaAleatoria.add("Amanhã tem aula de arquivos");
		minhaListaAleatoria.add(42);
		minhaListaAleatoria.add(25.938593285);
		minhaListaAleatoria.add(new Scanner(System.in));
		
		// Nome da sintaxe de <> é Generics
		List<String> cpfsCadastrados = new ArrayList<String>();
		
		
		cpfsCadastrados.add("99988877766"); //0
		cpfsCadastrados.add("11122233344"); //1
		cpfsCadastrados.add("44455566677"); //2
		cpfsCadastrados.add("99988877766");	//3
		cpfsCadastrados.add("55566688899"); //4
		cpfsCadastrados.add("12345678900"); //5
		cpfsCadastrados.add("00056589752"); //6
		cpfsCadastrados.add(1, "98765432177"); // Insere na posição 1
		
		// Set - Substitui um elemento
		cpfsCadastrados.set(0, "67768942322");
		
//		cpfsCadastrados.remove(5); //Remove o sexto elemento
//		cpfsCadastrados.remove("99988877766");
		
		// Só retorna o tamanho da lista
		int tamanhoLista = cpfsCadastrados.size();
		System.out.println("CPF na posição 2: " + cpfsCadastrados.get(2));
		System.out.println("CPF na última posição: " + cpfsCadastrados.get(tamanhoLista-1));
		
		System.out.println("\nLista de cpfs:");
		for (String cpf : cpfsCadastrados) {
			System.out.println("CPF: " + cpf);
		}
		
		// isEmpty - Retorna se a lista está vazia
		if (cpfsCadastrados.isEmpty()) {
			System.out.println("Cadastra um cpf aí");
		}
		else {
			System.out.println("Já tem cpfs cadastrados");
		}
		
		if (cpfsCadastrados.contains("1234567890011")) {
			// indexOf - retorna o indice do elemento da lista
			int numeroContaClaudinho = cpfsCadastrados.indexOf("12345678900");
			System.out.println("E não é que o Claudinho tem cadastro? O indice conta dele é a " + numeroContaClaudinho);
		}
		else {
			// Irá retornar -1 para indicar que não encontrou
			int numeroContaClaudinho = cpfsCadastrados.indexOf("1234567890011");
			System.out.println("Cluadinho, se cadastra aí. Indice da conta: " + numeroContaClaudinho);
		}
		
		// Ordena a lista
		Collections.sort(cpfsCadastrados);

		System.out.println("\nLista de cpfs ordenados:");
		for (String cpf : cpfsCadastrados) {
			System.out.println("CPF: " + cpf);
		}
		
		
		// Outra forma de declarar listas
		List<String> telefones = Arrays.asList("2244547487", "249920496049", "235437346");
		
		System.out.println("\nLista de telefones cadastrados:");
		for (String telefone : telefones) {
			System.out.println("Telefone: " + telefone);
		}
		
	}
}
