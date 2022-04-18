package exercicios;

public class SaqueDeposito {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Lucas";
		c1.numero = 4879848;
		
		c1.depositar(17000);
		System.out.println("Valor em conta: " + c1.saldo);
		
		if (c1.sacar(13000)) {
			System.out.println("Saque com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Valor em conta: " + c1.saldo);			
	}
}