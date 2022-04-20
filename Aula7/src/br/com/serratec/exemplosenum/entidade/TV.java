package br.com.serratec.exemplosenum.entidade;

import br.com.serratec.exemplosenum.enums.MarcasTV;

public class TV {
	private double polegadas;
	private String modelo;
	private MarcasTV marca;
	
	public TV(double polegadas, String modelo, String nomeMarca) {
		this.polegadas = polegadas;
		this.modelo = modelo;
		this.marca = MarcasTV.getMarcasTVPorNomeMarca(nomeMarca);
	}
	
	public TV(double polegadas, String modelo, MarcasTV marca) {
		this.polegadas = polegadas;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public TV(double polegadas, String modelo, int codMarca) {
		this.polegadas = polegadas;
		this.modelo = modelo;
		this.marca = MarcasTV.getMarcasTVPorCodMarca(codMarca);
	}

	public double getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public MarcasTV getMarca() {
		return marca;
	}

	public void setMarca(MarcasTV marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "TV [polegadas=" + polegadas + ", modelo=" + modelo + ", marca=" + marca.getNomeMarca() + "]";
	}
	
	
	
}
