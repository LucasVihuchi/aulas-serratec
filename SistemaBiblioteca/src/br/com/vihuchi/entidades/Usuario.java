package br.com.vihuchi.entidades;

import br.com.vihuchi.excecoes.DocumentoInvalidoException;
import br.com.vihuchi.excecoes.EstoqueInconsistenteException;
import br.com.vihuchi.excecoes.EstoqueInsuficienteException;
import br.com.vihuchi.excecoes.OperacaoInvalidaException;
import br.com.vihuchi.interfaces.Autenticacao;
import br.com.vihuchi.interfaces.Registro;
import br.com.vihuchi.validadores.ValidadorDocumento;

public abstract class Usuario implements Autenticacao, Registro {
	protected String nome;
	protected final String cpf;
	protected String telefone;
	protected Livro livroAlugado;
	
	public Usuario(String nome, String cpf, String telefone) throws DocumentoInvalidoException {
		this.nome = nome;
		this.cpf = ValidadorDocumento.validarCpf(cpf);
		this.telefone = telefone;
	}
	
	public final void alugarLivro(Livro livro) throws EstoqueInsuficienteException, OperacaoInvalidaException {
		if (!this.livroAlugado.equals(null)) {
			throw new OperacaoInvalidaException();
		}
		livro.aumentaQtdAlugado();
		this.livroAlugado = livro;
		System.out.println("O usuario " + this.nome + " alugou o livro " + this.livroAlugado.getTitulo());
	}
	
	public final void devolverLivro() throws OperacaoInvalidaException, EstoqueInconsistenteException {
		if (this.livroAlugado.equals(null)) {
			throw new OperacaoInvalidaException();
		}
		this.livroAlugado.diminuiQtdAlugado();
		System.out.println("O usuario " + this.nome + " devolveu o livro " + this.livroAlugado.getTitulo());
		this.livroAlugado = null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public Livro getLivroAlugado() {
		return livroAlugado;
	}
	
	
}
