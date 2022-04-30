package br.com.factories;

import br.com.models.Cliente;
import br.com.persistence.ClienteDao;

public class TexteConexao {
	public static void main(String[] args) {
//		Connection connection = new ConnectionFactory().getConnection();
//		System.out.println(connection);
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ClienteDao dao = new ClienteDao();
		dao.adicionaCliente(new Cliente(1, "Gilberto", "11122233344"));
	}
}
