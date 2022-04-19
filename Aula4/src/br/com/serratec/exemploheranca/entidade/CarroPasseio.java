package br.com.serratec.exemploheranca.entidade;

// Uma subclasse só pode ter uma superclasse
public class CarroPasseio extends Veiculo {
	private int qtdPortas;
	
	public CarroPasseio(String placa) {
		super(placa);
	}
	
	@Override // Sobreescrever
	public void acelerar() {
		System.out.println("O carro de passeio aumentou a velocidade em 10 km/h");
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
}
