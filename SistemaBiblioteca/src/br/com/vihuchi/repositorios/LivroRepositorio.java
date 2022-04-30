package br.com.vihuchi.repositorios;

import java.util.HashMap;

import br.com.vihuchi.entidades.Autor;
import br.com.vihuchi.entidades.Livro;
import br.com.vihuchi.excecoes.CadastroExistenteException;
import br.com.vihuchi.excecoes.CadastroInexistenteException;

public class LivroRepositorio {
	private static HashMap<Integer, Livro> mapaLivros = new HashMap<Integer, Livro>();
	
	public static void adicionaLivro(Livro livro) {
		if (mapaLivros.containsKey(livro.getId())) {
			throw new CadastroExistenteException();
		}
		mapaLivros.put(livro.getId(), livro);
	}
	
	public static Livro retornaLivro(int id) {
		Livro livroPesquisado = mapaLivros.get(id);
		if (livroPesquisado == null) {
			throw new CadastroInexistenteException();
		}
		return livroPesquisado;
	}
	
}
