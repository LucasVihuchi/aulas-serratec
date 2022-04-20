package br.com.serratec.entidade;

public class Imovel {
	private String local;
	private String tipo;
	private double valor;
	private Pessoa dono;
	
	public Imovel(String local, String tipo, double valor, Pessoa dono) {
		this.local = local;
		this.tipo = tipo;
		this.valor = valor;
		this.dono = dono;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Imovel [tipo=" + tipo + ", local=" + local + ", valor=" + valor + ", dono={" + dono.getNome() + "}]";
	}
}
