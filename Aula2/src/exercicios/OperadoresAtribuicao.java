package exercicios;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		int qtdPessoas = 0;
		System.out.println("Chegou alguém");
//		qtdPessoas = qtdPessoas + 1;
		qtdPessoas += 1;
		System.out.println("Quantidade pessoas: " + qtdPessoas);
		qtdPessoas = qtdPessoas * 35;
		qtdPessoas *= 35;
	}
}
