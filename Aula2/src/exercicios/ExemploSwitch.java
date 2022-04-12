package exercicios;

public class ExemploSwitch {

	public static void main(String[] args) {
		int opcao = 1;
		
		// escolha (opcao)
		// 		caso 1:
		switch (opcao) {
			case 1:
				System.out.println("Parabéns! Você selecionou o 1");
				// pare
				break;
			case 2:
				System.out.println("Você selecionou o 2");
				break;
			// caso contrario
			default: 
				System.out.println("Opção inválida. Parando o programa");
				break;
		}
	}
}
