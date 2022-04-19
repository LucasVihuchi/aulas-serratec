package br.com.serratec.versao2comgetset.entidades;

public class Cachorro2 {
	// Exemplo com encapsulamento
	
	
	// Private - Só a própria classe consegue enxergar o atributo
	// Public - Qualquer arquivo no projeto consegue ver o atributo
	
	
	private String nome;
	private int idade;
	private String raca;
	
	public void latir() {
		System.out.println("O cachorro " + nome + " latiu" );
	}
	
	public void fazerAniversario() {
		this.idade += 1;
	}
	
	
	// Set - Atribui um novo valor para o atributo
		// sempre tem o tipo void e recebe por parametro uma variável do tipo do atributo
	
	// Get - Retorna o valor do atributo desejado - sempre tem o tipo do atributo
	
	public void setNome(String nomeInserido) {
		this.nome = nomeInserido;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idadeInserida) {
		if (idadeInserida >= 0) {
			this.idade = idadeInserida;			
		}
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setRaca(String racaInserida) {
		if(!racaInserida.equals("")) {
			this.raca = racaInserida;			
		}
	}
	
	public String getRaca() {
		return this.raca;
	}
	
}
