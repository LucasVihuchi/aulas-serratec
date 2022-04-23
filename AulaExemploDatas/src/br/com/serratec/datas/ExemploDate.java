package br.com.serratec.datas;

import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {
		// Por padrão o date usa a data de hoje (Está deprecado, não é para usar Date)
		Date dataQualquer = new Date();
		
		System.out.println("Date de hoje: " + dataQualquer);
		// Métodos deprecated ficam riscados e não devem ser usados
		System.out.println("Minutos de hoje: " + dataQualquer.getMinutes());
	}

}
