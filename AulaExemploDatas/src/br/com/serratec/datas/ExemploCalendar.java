package br.com.serratec.datas;

import java.util.Calendar;

public class ExemploCalendar {
	public static void main(String[] args) {
		// Por padrão a data é hoje
		Calendar hoje = Calendar.getInstance();
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Date de hoje: " + dia + "/" + mes + "/" + ano);
		// Métodos deprecated ficam riscados e não devem ser usados
//		System.out.println("Minutos de hoje: " + dataQualquer.getMinutes());
	}
}
