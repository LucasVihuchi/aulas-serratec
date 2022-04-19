package br.com.serratec.exemploheranca.entidade;

public class Veiculo {
	// Usamos # no diagrama de classes para apontar o nível protected
	// Usamos o protected para que os atributos fiquem acessíveis nas sub classes
	protected String chassi;
	protected String placa;
	protected String cor;
	protected double ipva;
	
	public Veiculo(String placa) {
		this.placa = placa;
	}
	
	public void acelerar() {
		System.out.println("O veículo aumentou a velocidade em 5 km/h");
	}
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getIpva() {
		return ipva;
	}
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	
}
