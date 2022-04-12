package exercicios;

public class ExemploAposentadoria {

	public static void main(String[] args) {
		int idade = 18;
		
		
		// idade igual a 18 OU idade == 65
		if (idade == 18 || idade == 65) {
			System.out.println("Chegou numa idade de mudanças hein");
		}
		
		if (idade >= 65) {
			System.out.println("A pessoa pode se aposentar");
		}
		// idade maior ou igual a 16 E idade menor que 65
		else if (idade >= 16 && idade < 65) {
			System.out.println("A pessoa está no período ativo profissional");
		}
		else {
			System.out.println("A pessoa não pode trabalhar");
		}
	}

}
