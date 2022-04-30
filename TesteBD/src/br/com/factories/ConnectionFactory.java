package br.com.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String urlBase = "jdbc:postgresql://localhost:5432/teste";
	String usuario = "lucas.vihuchi";
	String senha = "";
	Connection conexao;
	
	public Connection getConnection() {
		System.out.println("Iniciando tentativa de conexão ao banco");
		try {
			conexao = DriverManager.getConnection(urlBase, usuario, senha);
			System.out.println("Conectado com sucesso");
			return conexao;
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco");
			return null;
		}
	}
}
