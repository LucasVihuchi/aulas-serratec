package br.com.serratec.exemploheranca.dominio;

import br.com.serratec.exemploheranca.entidade.Caminhao;
import br.com.serratec.exemploheranca.entidade.CarroPasseio;

public class VeiculoMain {

	public static void main(String[] args) {
		Caminhao mac = new Caminhao("AAA5566");
//		mac.setPlaca("AAA5566");
		
		CarroPasseio relampagoMacQueen = new CarroPasseio("BBB7788");
//		relampagoMacQueen.setPlaca("BBB7788");
		
		mac.acelerar();
		relampagoMacQueen.acelerar();
		

	}

}
