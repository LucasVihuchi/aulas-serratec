package br.com.serratec.versao4membrosestaticos.dominio;

import br.com.serratec.versao4membrosestaticos.entidades.Cachorro4;

public class CachorroMain4 {
	public static void main(String[] args) {
		Cachorro4 tobi = new Cachorro4("Tobi", -67000);
		tobi.setRaca("SRD");
		
		tobi.latir();
		
		tobi.fazerAniversario();
		
		System.out.println("Familia do Tobi: " + tobi.getFamilia() );
		System.out.println("Familia de todos os cachorros: " + Cachorro4.getFamilia() );
	
		
		// Estamos protegidos contra isso
//		tobi.setIdade(-67000);
		
		
		System.out.println("A idade do " + tobi.getNome() + " é " + tobi.getIdade());
		
		
		Cachorro4 laika = new Cachorro4("Laika", 3, "Border Collie");
		
		laika.latir();
		laika.latir("espanhol");
				
		System.out.println("Quantidade cachorros: " + Cachorro4.getQuantidadeCachorrosCadastrados());
		

	}

}
