package br.com.serratec.exemplosenum.dominio;

import java.util.Scanner;

import br.com.serratec.exemplosenum.entidade.TV;
import br.com.serratec.exemplosenum.enums.MarcasTV;

public class TVMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a polegada da TV: ");
		int polegadas = entrada.nextInt();
		
		// Limpa o caractere de quebra de linha
		entrada.nextLine();
		System.out.print("Insira o modelo da TV: ");
		String modelo = entrada.nextLine();
		
//		System.out.print("Insira a marca da TV: ");
//		String nomeMarca = entrada.nextLine();
		
		System.out.print("Insira o código da marca da TV: ");
		int codMarca = entrada.nextInt();
		
		TV samsung42 = new TV(polegadas, modelo, codMarca);
		
		System.out.println(samsung42);
	}

}
