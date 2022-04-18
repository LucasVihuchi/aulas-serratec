package exercicios;

public class Conta {
	private String titular;
	private double numero;
	private String chavePix;
	private double saldo;
	
	public Conta() {
		System.out.println("Conta criada com sucesso!");
	}
	
	public Conta(String titular, double numero) {
		this();
		this.setTitular(titular);
		this.setNumero(numero);
	}
	
	public Conta(String titular, double numero, String chavePix) {
		this(titular, numero);
		this.setChavePix(chavePix);
	}
	

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}



	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean sacar(double valorSaque) {
		if (this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			return true;
		}
		return false;
	}
	
	public void imprimirSaldo() {
		System.out.println("O valor do saldo é R$ " + this.saldo);
	}
}
