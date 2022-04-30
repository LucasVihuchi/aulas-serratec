package br.com.vihuchi.entidades;

import java.time.LocalDate;

import br.com.vihuchi.enums.GeneroLivro;
import br.com.vihuchi.excecoes.EstoqueInconsistenteException;
import br.com.vihuchi.excecoes.EstoqueInsuficienteException;

public final class Livro {
	private static int totalLivrosCadastrados;
	
	private int id;
	private String titulo;
	private GeneroLivro genero;
	private Autor autor;
	private String edicao;
	private LocalDate dataPublicacao;
	private int qtdEstoque;
	private int qtdAlugado;
	private Bibliotecario cadastradoPor;
	
	Livro(int id, String titulo, String edicao, GeneroLivro genero, Autor autor, Bibliotecario cadastradoPor, int qtdEstoque) {
		this.id = id;
		this.titulo = titulo;
		this.edicao = edicao;
		this.genero = genero;
		this.autor = autor;
		this.cadastradoPor = cadastradoPor;
		this.qtdEstoque = qtdEstoque;
		System.out.println("Livro criado com sucesso");
		Livro.totalLivrosCadastrados++;
	}
	
	Livro(int id, String titulo, String edicao, GeneroLivro genero, Autor autor, Bibliotecario cadastradoPor, int qtdEstoque, LocalDate dataPublicacao) {
		this(id, titulo, edicao, genero, autor, cadastradoPor, qtdEstoque);
		this.dataPublicacao = dataPublicacao;
	}
	
	public Livro(int id, String titulo, String edicao, GeneroLivro genero, Autor autor, Bibliotecario cadastradoPor, int qtdEstoque, LocalDate dataPublicacao, int qtdalugados) {
		this(id, titulo, edicao, genero, autor, cadastradoPor, qtdEstoque, dataPublicacao);
		this.qtdAlugado = qtdalugados;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public static int getTotalLivrosCadastrados() {
		return totalLivrosCadastrados;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public GeneroLivro getGenero() {
		return genero;
	}

	public int getQtdAlugado() {
		return qtdAlugado;
	}
	
	public void aumentaQtdAlugado() throws EstoqueInsuficienteException {
		if (this.qtdAlugado >= this.qtdEstoque) {
			throw new EstoqueInsuficienteException();
		}
		this.qtdAlugado++;
	}
	
	public void diminuiQtdAlugado() throws EstoqueInconsistenteException {
		if (this.qtdAlugado <= 0) {
			throw new EstoqueInconsistenteException();
		}
		this.qtdAlugado--;
	}

	public Bibliotecario getCadastradoPor() {
		return cadastradoPor;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", genero=" + genero.getNomeAmigavel() + ", autor=" + autor.getNome() + ", edicao="
				+ edicao + "]";
	}
	
	
	
	
}
