package br.com.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.factories.ConnectionFactory;
import br.com.models.Cliente;

public class ClienteDao {
	private Connection connection;

	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionaCliente(Cliente cliente) {
		String sql = "insert into cliente (nome, cpf) values(?,?)";
		
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Problema ao inserir clientes");
		}
	}
	
}
