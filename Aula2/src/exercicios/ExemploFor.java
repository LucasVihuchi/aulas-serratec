package exercicios;

public class ExemploFor {
	public static void main(String[] args) {
		// para
		int numeroBase = 8;
		
		// for (inicialização; condição; incremento)
//		for (int indice = 0; indice <= 10; indice++) {
//			System.out.println(numeroBase + " x " + indice + " = " + (numeroBase * indice));
//		}
		
		for (int indice = 10; indice >= 0; indice--) {
			System.out.println(numeroBase + " x " + indice + " = " + (numeroBase * indice));
		}
	}
}
