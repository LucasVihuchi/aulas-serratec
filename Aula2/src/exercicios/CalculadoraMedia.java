package exercicios;

public class CalculadoraMedia {

	public static void main(String[] args) {
		int m1 = 2;
		int m2 = 4;
		int m3 = 5;
		int m4 = 8;
		
		double media = (m1 + m2 + m3 + m4)/4f;
		
		System.out.printf("Média: %.2f", media);
		System.out.println("Média: " + String.format("%.2f", media));

	}

}
