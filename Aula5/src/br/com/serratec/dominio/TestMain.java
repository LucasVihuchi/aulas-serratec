package br.com.serratec.dominio;

import br.com.serratec.entidade.Imovel;
import br.com.serratec.entidade.Pessoa;

public class TestMain {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("12345678900", "Lucas", "2499899889");
		
		Imovel m1 = new Imovel("Rua logo ali", "Apartamento", 235035.50, p1);
		Imovel m2 = new Imovel("Rua logo ali2", "Casa", 11111.50, p1);

		System.out.println("Dono do imovel 1: " + m1.getDono());
		System.out.println("Imovel 1: " + m1);
	}

}
