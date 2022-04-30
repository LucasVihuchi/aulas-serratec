package br.com.serratec.control;

import br.com.serratec.model.Cliente;
import br.com.serratec.persistence.ClienteDao;

public class ClienteControl {
	
	public void criarCliente(Cliente cliente) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.criarCliente(cliente);
		System.out.println("Cliente criado com sucesso");
	}
	
	public Cliente getCliente(String cpf) {
		ClienteDao clienteDao = new ClienteDao();
		return clienteDao.getCliente(cpf);
	}
	
	public void atualizaCliente(Cliente cliente) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.atualizarCliente(cliente);
		System.out.println("Cliente atualizado com sucesso");
	}
	
	public void deletarCliente(String cpf) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.deletarCliente(cpf);
		System.out.println("Cliente deletado com sucesso");
	}
}
