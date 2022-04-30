package br.com.vihuchi.repositorios;

import java.util.HashMap;

import br.com.vihuchi.entidades.Autor;
import br.com.vihuchi.excecoes.CadastroExistenteException;
import br.com.vihuchi.excecoes.CadastroInexistenteException;

public class AutorRepositorio {
	private static HashMap<Integer, Autor> mapaAutores = new HashMap<Integer, Autor>();
	
	/** Função que adiciona um Autor ao repositório em memória(HashMap) 
	  * e caso o Autor já exista, ela lança uma exceção do tipo CadastroExistenteException
	  *	@param autor - Autor que será salvo no HashMap
	 */
	public static void adicionaAutor(Autor autor) {
		if (mapaAutores.containsKey(autor.getIdAutor())) {
			throw new CadastroExistenteException();
		}
		mapaAutores.put(autor.getIdAutor(), autor);
	}
	
	/** @deprecated
	 */
	public static void removeAutor(int idAutor) {
		if (!mapaAutores.containsKey(idAutor)) {
			throw new CadastroInexistenteException();
		}
		mapaAutores.remove(idAutor);
	}
	
	/** Função que retorna um Autor da memória(HashMap)
	  *	@param idAutor - Id do autor que será retornado na memória
	  *
	  *	@return Retorna um Autor que tenha o id especificado
	  * 
	  * @throws CadastroInexistenteException Lançada quando um cadastrado associado ao id fornecido não existe
	  *
	  * @see ArquivoAutoresManipulador
	  * @link https://google.com
	  * 
	  * @author Lucas Vihuchi
	  * @since 0.0.1
	  * 
	  * 
	 */
	public static Autor retornaAutor(int idAutor) {
		Autor autorPesquisado = mapaAutores.get(idAutor);
		if (autorPesquisado == null) {
			throw new CadastroInexistenteException();
		}
		return autorPesquisado;
	}
	
}
