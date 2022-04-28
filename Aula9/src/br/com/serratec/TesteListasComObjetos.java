package br.com.serratec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListasComObjetos {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		listaPessoas.add(new Pessoa("Rodolfo", "52272728288"));
		listaPessoas.add(new Pessoa("Amanda", "55566699988"));
		
		Pessoa p1 = new Pessoa("Gabriel", "11122233344455");
		listaPessoas.add(p1);
		
		// O contains sempre vai comparar os endereços na memória
		if (listaPessoas.contains(p1)) {
			System.out.println("Essa pessoa está cadastrada");
		} else {
			System.out.println("Essa pessoa não está cadastrada");
		}
		
		System.out.println("Lista de Pessoas: ");
		for(Pessoa pessoaAtual : listaPessoas) {
			System.out.println(pessoaAtual);
		}
		
		Collections.sort(listaPessoas);
		
		
		System.out.println("\n\nLista de Pessoas ordenada: ");
		for(Pessoa pessoaAtual : listaPessoas) {
			System.out.println(pessoaAtual);
		}
		
	}

}
