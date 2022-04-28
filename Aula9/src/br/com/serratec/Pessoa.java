package br.com.serratec;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	// Serve apenas para ordenação
	@Override
	public int compareTo(Pessoa outraPessoa) {
		return this.nome.compareTo(outraPessoa.nome);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}

//	// Serve apenas para ordenação (Versão mais completa com comparação de cpf)
//	@Override
//	public int compareTo(Pessoa outraPessoa) {
//		// CompareTo tem uma regra que é usada para qualquer compareTo
//		// Retornamos 0 se os valores são iguais
//		// Retornamos -1 Se o primeiro é menor que o segundo
//		// Retornamos 1 Se o primeiro é maior que o segundo
//		
//		// Se o cpf for igual, é a mesma pessoa
//		if(this.cpf.equals(outraPessoa.cpf)) {
//			return 0; // Retornar 0, significa que são iguais
//		} 
//		// Caso contrário, comparo o nome das pessoas e se o nome da primeira for menor que a segunda, retorna -1
//		else if (this.nome.compareTo(outraPessoa.nome) < 0) {
//			return -1; // Retornar -1, significa que o nome atual é anterior no alfabeto em relação ao da outraPessoa
//		} 
//		// Se não cair nos casos anteriores, retorna que é maior
//		else {
//			return 1; // Retornar 1, significa que o nome atual é posterior no alfabeto em relação ao da outraPessoa
//		}
//	}
	
	
	
	
}
