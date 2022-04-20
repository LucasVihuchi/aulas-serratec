package br.com.serratec.exemplosenum.enums;

public enum MarcasTV {
	CCE(4, "CCE"),
	LG(2, "LG"), 
	OUTRO(0, "Outros"),
	PHILCO(3, "Philco"), 
	SAMSUNG(1, "Samsung"), 
	SEMP_TOSHIBA(70, "Semp Toshiba"), 
	XIAOMI(5, "Xiaomi");
	
	private int codMarca;
	private String nomeMarca;

	private MarcasTV(int codMarca, String nomeMarca) {
		this.codMarca = codMarca;
		this.nomeMarca = nomeMarca;
	}
	
	public static MarcasTV getMarcasTVPorNomeMarca(String nomeMarcaInserido) {
		MarcasTV[] vetorMarcas = MarcasTV.values();
		
		// Para marca do tipo MarcasTV em vetorMarcas, faça 
		for (MarcasTV marcaAtual : vetorMarcas) {
			String nomeMarcaAtualMinusculo = marcaAtual.getNomeMarca().toLowerCase();
			if (nomeMarcaAtualMinusculo.equals(nomeMarcaInserido.toLowerCase())) {
				return marcaAtual;
			}
		}
		return MarcasTV.OUTRO;
	}
	
	public static MarcasTV getMarcasTVPorCodMarca(int codMarcaInserido) {
		MarcasTV[] vetorMarcas = MarcasTV.values();
		
		// Para marca do tipo MarcasTV em vetorMarcas, faça 
		for (MarcasTV marcaAtual : vetorMarcas) {
			if(marcaAtual.getCodMarca() == codMarcaInserido) {
				return marcaAtual;
			}
		}
		return MarcasTV.OUTRO;
	}

	public int getCodMarca() {
		return codMarca;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}
}
