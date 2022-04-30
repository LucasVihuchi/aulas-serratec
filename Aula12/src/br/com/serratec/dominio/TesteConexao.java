package br.com.serratec.dominio;

import br.com.serratec.control.ClienteControl;
import br.com.serratec.model.Cliente;

public class TesteConexao {

	public static void main(String[] args) {
//		Só para testar a conexão
//		// Cria fabrica de conexões com o banco
//		ConexaoFactory fabrica = new ConexaoFactory();
//		// Cria uma conexão com o banco
//		Connection conexao = fabrica.getConexao();
		
		
//		Exemplo create
//		Cliente carlos = new Cliente("Carlos", "33344455533", 35);
		ClienteControl controleDeClientes = new ClienteControl();
//		controleDeClientes.criarCliente(carlos);
		
		// Exemplo Retrieve
		Cliente c1 = controleDeClientes.getCliente("33344455533");
		System.out.println("Retrieve: " + c1);
		
		// Exemplo update
		Cliente gabriel = new Cliente("Gabriel", "55577733322", 16);
		controleDeClientes.atualizaCliente(gabriel);
		System.out.println("Retrieve depois do update: " + controleDeClientes.getCliente("55577733322"));
	
		controleDeClientes.deletarCliente("55577733322");
		
	
	}

}
