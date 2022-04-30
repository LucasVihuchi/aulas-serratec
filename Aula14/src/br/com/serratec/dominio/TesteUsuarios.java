package br.com.serratec.dominio;

import br.com.serratec.entidades.Usuario;

public class TesteUsuarios {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("João", "12345678900", 18);
		Usuario u2 = new Usuario("João", "12345678900", 18);
		
		if (u1.equals(u2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		
		System.out.println(u1);
		System.out.println(u2);
	
	}
}
