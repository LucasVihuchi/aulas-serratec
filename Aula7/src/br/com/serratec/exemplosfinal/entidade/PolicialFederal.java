package br.com.serratec.exemplosfinal.entidade;

import java.time.LocalDate;

// Policial federal não pode ser usado como super classe ou classe mãe
public final class PolicialFederal extends Policial {
	private String unidade;
	
	public PolicialFederal(String nome, String registro, String unidade) {
		super(nome, registro);
		this.unidade = unidade;
	}

//	O método comentado abaixo não funciona porque o método de policial é final
//  Métodos final não podem ser sobreescritos
//	@Override
//	public void registrarPrisao(String suspeito) {
//		System.out.println("O policial federal " + this.nome + 
//				" efeutou a prisão de " + suspeito);
//	}
	
	// Esse método funciona porque tem um parametro a mais, 
	// então é diferente do método em Policial
	public void registrarPrisao(String suspeito, LocalDate dataPrisao) {
		System.out.println("O policial " + this.nome + 
				" efeutou a prisão de " + suspeito + " na data " + dataPrisao);
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
}
