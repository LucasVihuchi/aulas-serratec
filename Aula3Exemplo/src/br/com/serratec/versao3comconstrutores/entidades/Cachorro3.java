package br.com.serratec.versao3comconstrutores.entidades;

public class Cachorro3 {
	// Exemplo com encapsulamento e construtores
	
	
	// Private - Só a própria classe consegue enxergar o atributo
	// Public - Qualquer arquivo no projeto consegue ver o atributo
	
	private String nome;
	private int idade;
	private String raca;
	
	// O tipo é o nome da Classe, mas não temos nome para construtores
	// Isso é um construtor que pede 2 parâmetros obrigatórios
	public Cachorro3(String nomeInserido, int idadeInserida) {
		this.nome = nomeInserido;
		this.setIdade(idadeInserida);
	}
	
	public Cachorro3(String nomeInserido, int idadeInserida, String racaInserida) {
		this(nomeInserido, idadeInserida);
		this.raca = racaInserida;
	}
		
	
	public void latir() {
		System.out.println("O cachorro " + nome + " latiu" );
	}
	
	public void latir(String lingua) {
		System.out.println("O cachorro " + nome + " latiu em " + lingua);
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
	
	// Private para outras classe não conseguir enxergar ela
	private void setIdade(int idadeInserida) {
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
