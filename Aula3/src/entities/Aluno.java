package entities;

public class Aluno {
	public int codAluno;
	public String nome;
	public String telefone;
	public String endereco;
	public double nota1;
	public double nota2;
	
	public double calcularNota() {
		return this.nota1 + this.nota2;
	}
	
	public void imprimir() {
		System.out.println("Codigo aluno: " + this.codAluno + " Nome: " + this.nome);
	}
}
