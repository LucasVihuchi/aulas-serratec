package br.com.serratec.exemplosfinal.dominio;

import br.com.serratec.exemplosfinal.entidade.Policial;
import br.com.serratec.exemplosfinal.entidade.PolicialFederal;

public class PoliciaisMain {

	public static void main(String[] args) {
		Policial p1 = new Policial("Roberto", "12215125");
		PolicialFederal pf1 = new PolicialFederal("Gilberto", "1515", "COPE");
		
		// Atributos final são constantes, depois de setado um valor,
		// não pode seralterado
		final String NOME_SUSPEITO = "Gibraltar";
		
		final int IDADE_SUSPEITO;		
		IDADE_SUSPEITO = 13;
		
		System.out.println("Número de armas máximas de um policial: "
		+ Policial.NUM_MAXIMO_ARMAS);
		
//		Não funciona porque o numéro máximo de armas é final (constante)
//		Policial.NUM_MAXIMO_ARMAS = 5;
		
	}

}
