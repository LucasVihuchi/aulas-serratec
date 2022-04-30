package br.com.vihuchi.interfaces;

public interface FazerAniversario {
	public abstract void fazerAniversario();
	
	default void exibirMensagemAniversario() {
		System.out.println("Parabéns, hoje é o seu aniversário");
	}
}
