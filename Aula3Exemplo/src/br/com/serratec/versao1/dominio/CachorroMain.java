package br.com.serratec.versao1.dominio;

import br.com.serratec.versao1.entidades.Cachorro;

public class CachorroMain {

	public static void main(String[] args) {
		Cachorro tobi = new Cachorro();
		tobi.nome = "Tobi";
		tobi.idade = 4;
		tobi.raca = "SRD";
		
		tobi.latir();
		
		tobi.fazerAniversario();
		
		System.out.println("A idade do " + tobi.nome + " é " + tobi.idade);
		
		

	}

}
