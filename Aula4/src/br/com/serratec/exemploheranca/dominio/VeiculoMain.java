package br.com.serratec.exemploheranca.dominio;

import br.com.serratec.exemploheranca.entidade.Caminhao;
import br.com.serratec.exemploheranca.entidade.CarroPasseio;
import br.com.serratec.exemploheranca.entidade.Veiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		Caminhao mac = new Caminhao("AAA5566");
//		mac.setPlaca("AAA5566");
		
		CarroPasseio relampagoMacQueen = new CarroPasseio("BBB7788");
//		relampagoMacQueen.setPlaca("BBB7788");
		
		mac.acelerar();
		relampagoMacQueen.acelerar();
		
		// 
		Veiculo doc = new CarroPasseio("CCC9900");
		CarroPasseio doc2 = (CarroPasseio) doc;
		
		Veiculo doc3 = (Veiculo) doc2;

		
		darManutencao(mac);
		darManutencao(relampagoMacQueen);
		
		doc.acelerar();
	}
	
	public static void darManutencao(Veiculo vh) {
		System.out.println("O veículo " + vh.getPlaca() + " recebeu manutenção");
	}

}
