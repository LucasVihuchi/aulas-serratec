package br.com.serratec.versao3comconstrutores.dominio;

import br.com.serratec.versao3comconstrutores.entidades.Cachorro3;

public class CachorroMain3 {

	public static void main(String[] args) {
		Cachorro3 tobi = new Cachorro3("Tobi", -67000);
		tobi.setRaca("SRD");
		
		tobi.latir();
		
		tobi.fazerAniversario();
		
		// Estamos protegidos contra isso
//		tobi.setIdade(-67000);
		
		
		System.out.println("A idade do " + tobi.getNome() + " é " + tobi.getIdade());
		
		
		Cachorro3 laika = new Cachorro3("Laika", 3, "Border Collie");
		
		laika.latir();
		laika.latir("espanhol");
		

	}

}
