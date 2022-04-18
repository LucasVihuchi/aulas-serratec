package exercicios;

public class Conta {
	public String titular;
	public double saldo;
	public double numero;
	
	public void depositar(double valorDepositado) {
		this.saldo += valorDepositado;
	}
	
	public boolean sacar(double valorSacado) {
		if (this.saldo >= valorSacado) {
			this.saldo -= valorSacado;
			return true;
		}
		return false;
	}
}
