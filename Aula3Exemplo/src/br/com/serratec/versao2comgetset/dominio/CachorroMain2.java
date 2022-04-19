package br.com.serratec.versao2comgetset.dominio;

import br.com.serratec.versao2comgetset.entidades.Cachorro2;

public class CachorroMain2 {

	public static void main(String[] args) {
		Cachorro2 tobi = new Cachorro2();
		tobi.setNome("Tobi");
		tobi.setIdade(4);
		tobi.setRaca("SRD");
		
		tobi.latir();
		
		tobi.fazerAniversario();
		
		// Estamos protegidos contra isso
		tobi.setIdade(-67000);
		
		System.out.println("A idade do " + tobi.getNome() + " é " + tobi.getIdade());
		
		

	}

}
