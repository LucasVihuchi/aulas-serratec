package br.com.vihuchi.enums;

import br.com.vihuchi.excecoes.EnumInexistenteException;

public enum GeneroLivro {
	TERROR(1, "Terror"),
	MISTERIO(2 , "Mistério"),
	ROMANCE(3, "Romance"),
	FANTASIA(4, "Fantasia"),
	SCIFI(5, "Ficção científica"),
	BIOGRAFIA(6, "Biografia");
	
	private int idGenero;
	private String nomeAmigavel;
	
	// É privado para proibir a sintaxe 'new GeneroLivro(...)'
	GeneroLivro(int idGenero, String nomeAmigavel) {
		this.idGenero = idGenero;
		this.nomeAmigavel = nomeAmigavel;
	}
	
	public static GeneroLivro getGeneroPorNomeAmigavel(String nomeRecebido) throws EnumInexistenteException {
		// Transforma para minusculo
		String nomeRecebidoMinusculo = nomeRecebido.toLowerCase();
		// Percorre todos os generos
		for(GeneroLivro generoAtual : GeneroLivro.values()) {
			// Para cada genero, transforma o nome amigável dele para minusculo
			String nomeAmigavelAtualMinusculo = generoAtual.nomeAmigavel.toLowerCase();
			// Compara os nomes em minúsculo
			if (nomeAmigavelAtualMinusculo.equals(nomeRecebidoMinusculo)) {
				return generoAtual;
			}
		}
		// Lança exceção se não achar nenhum genero compatível
		throw new EnumInexistenteException();
	}

	public int getIdGenero() {
		return idGenero;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}
	
	
}
