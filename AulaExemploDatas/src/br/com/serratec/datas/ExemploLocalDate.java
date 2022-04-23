package br.com.serratec.datas;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ExemploLocalDate {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println("Data de hoje: " + hoje);
		System.out.println("Momento atual: " + agora);
		
//		Scanner leitor = new Scanner(System.in);
//		System.out.print("Insira uma data: ");
//		String dataComoString = leitor.nextLine();
//		
//		LocalDate dataInserida = LocalDate.parse(dataComoString);
		
//		System.out.println("Data inserida: " + dataInserida.getMonth());
		
		// Não funciona com LocalDate ou LocalDateTime
//		SimpleDateFormat formatoBrasil = new SimpleDateFormat("dd/MM/yyyy");
		
		DateTimeFormatter formatoDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoTempoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:SSSS");
		
		System.out.println("Data de hoje formatada bonitinha: " + formatoDataBrasil.format(hoje));
		System.out.println("Momento atual formatado: " + formatoTempoBrasil.format(agora));
		
		LocalDate mesQueVem = hoje.plusMonths(1).minusWeeks(1).plus(7, ChronoUnit.MILLENNIA);
		
		System.out.println("Mês que vem: " + formatoDataBrasil.format(mesQueVem));
		
		System.out.println("Ano bissexto: " + hoje.isLeapYear());
		
		
		// Cria uma data com os dados inseridos
		LocalDate diaNascimento = LocalDate.of(1980, 6, 18);
		System.out.println("Dia Nascimento: " + formatoDataBrasil.format(diaNascimento));
		
		// isAfter - É depois?
		// isBefore - É antes?
		// isEquals - É igual?
		if (diaNascimento.isAfter(hoje)) {
			System.out.println("Caramba, você sabe prefer o futuro");
		}
		else {
			System.out.println("Beleza, faz sentido");
		}
		
//		Zona de fuso horario. PS.: Não é muito usado
		ZoneId zonaAtual = ZoneId.systemDefault();
		System.out.println("Zona do PC rodando o projeto: " + zonaAtual);
		
		Period quantoTempoEstouVivo = Period.between(diaNascimento, hoje);
		System.out.println("Período vivo: " + quantoTempoEstouVivo.getYears());
		
		
		LocalDateTime diaNascimentoComHora = LocalDateTime.of(1980, 6, 18, 13, 40, 30);
		
		Duration quantoTempoEstouVivoComTempo = Duration.between(diaNascimentoComHora, agora);
		System.out.println("Período vivo: " + quantoTempoEstouVivoComTempo.getSeconds());
	}
}
