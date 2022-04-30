package br.com.serratec.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Factory = Fábrica
public class ConexaoFactory {
	private final String urlBase = "jdbc:postgresql://localhost:5432/aula11";
	private final String usuario = "lucas.vihuchi";
	private final String senha = "";
	private Connection conexao;
	
	public Connection getConexao() {
		System.out.println("Iniciando a conexão com o banco de dados");
		try {
			// Linha opcional nas versões do Java maiores que a 6
			// Carrega o driver do banco de dados
			Class.forName("org.postgresql.Driver");
			
			// Cria conexão com o banco de dados
			conexao = DriverManager.getConnection(urlBase, usuario, senha);
			System.out.println("Conexão realizada com sucesso");
			return conexao;
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao se conectar com o banco de dados");
			return null;
		} catch (ClassNotFoundException e) {
			System.out.println("Ocorreu um erro ao carregar o driver do banco de dados");
			return null;
		}
	}
}
