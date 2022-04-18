package calc;

public class Calculadora {
	static double memoria;
	
	public static double somar (double n1, double n2) {
		return n1 + n2;
	}
	
	public static double subtrair (double n1, double n2) {
		return n1 - n2;
	}
	
	public static double multiplicar (double n1, double n2) {
		return n1 * n2;
	}
	
	public static double dividir (double n1, double n2) {
		return n1 / n2;
	}
	
	public static double calcularResto (double n1, double n2) {
		return n1 % n2;
	}
	
	
	public static void calcular(double n1, double n2, int operacao) {
		switch (operacao) {
			case 1:
				System.out.println("O resultado da soma de " + n1 + " + " + n2 + " é: " + somar(n1,n2));
				break;
			case 2:
				System.out.println("O resultado da subtração de " + n1 + " - " + n2 + " é: " + subtrair(n1,n2));
				break;
			case 3:
				System.out.println("O resultado da multiplicação de " + n1 + " * " + n2 + " é: " + multiplicar(n1,n2));
				break;
			case 4:
				System.out.println("O resultado da divisão de " + n1 + " / " + n2 + " é: " + dividir(n1,n2));
				break;
			case 5:
				System.out.println("O resultado do resto da divisão de " + n1 + "% " + n2 + " é: " + calcularResto(n1,n2));
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}
	}
}
