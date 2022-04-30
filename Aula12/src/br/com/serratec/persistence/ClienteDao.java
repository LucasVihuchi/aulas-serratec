package br.com.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import br.com.serratec.factories.ConexaoFactory;
import br.com.serratec.model.Cliente;

// Data Access Object (Objeto de acesso a dados)
public class ClienteDao {
	private Connection conexao;
	
	public ClienteDao() {
		conexao = new ConexaoFactory().getConexao();
	}
	
	// CRUD - Create(Criar), Retrieve(Recuperar), Update(Atualizar), Delete(Deletar)
	
	public void criarCliente(Cliente cliente) {
		String comandoSql = "insert into cliente (nome, cpf, idade) values (?, ?, ?);";
		
		try {
			PreparedStatement declaracao = conexao.prepareStatement(comandoSql);
			
			declaracao.setString(1, cliente.getNome());
			declaracao.setString(2, cliente.getCpf());
			declaracao.setInt(3, cliente.getIdade());
			
			declaracao.execute();
			declaracao.closeOnCompletion();
			
		} catch (SQLException e) {
			System.out.println("Erro ao criar comando sql");
		} finally {
			fecharConexao();
		}
		
	}
	
	public Cliente getCliente(String cpf) {
		String comandoSql = "select * from cliente c where c.cpf = ?";
		try {
			PreparedStatement declaracao = conexao.prepareStatement(comandoSql);
			declaracao.setString(1, cpf);
			
			ResultSet setDeResultados = declaracao.executeQuery();
			
			// O next é obrigatório para pegar o primeiro item
			setDeResultados.next();
			int id = setDeResultados.getInt("id");
			String nome = setDeResultados.getString("nome");
			String cpfBD = setDeResultados.getString("cpf");
			int idade = setDeResultados.getInt("idade");

			return new Cliente(id, nome, cpfBD, idade);
		} catch (SQLException e) {
			System.out.println("Erro ao criar comando sql");
			return null;
		} finally {
			fecharConexao();
		}
		
	}
	
	public void atualizarCliente(Cliente cliente) {
		String comandoSql = "update cliente c set nome = ?, cpf = ?, idade = ? where c.cpf = ?;";
		
		try {
			PreparedStatement declaracao = conexao.prepareStatement(comandoSql);
			
			declaracao.setString(1, cliente.getNome());
			declaracao.setString(2, cliente.getCpf());
			declaracao.setInt(3, cliente.getIdade());
			declaracao.setString(4, cliente.getCpf());
			
			declaracao.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao criar comando sql");
		} finally {
			fecharConexao();
		}
	}
	
	public void deletarCliente(String cpf) {
		String comandoSql = "delete from cliente where cpf = ?";
		
		try {
			PreparedStatement declaracao = conexao.prepareStatement(comandoSql);
			declaracao.setString(1, cpf);
			
			declaracao.execute();
			declaracao.close();			
		} catch (SQLException e) {
			System.out.println("Erro ao criar comando sql");
		} finally {
			fecharConexao();
		}
		
	}
	
	public void fecharConexao() {
		try {
			conexao.close();
		} catch (SQLException e) {
			System.out.println("Erro ao fechar conexão com o banco");
		}
	}
}
