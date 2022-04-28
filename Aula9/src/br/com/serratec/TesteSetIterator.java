package br.com.serratec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteSetIterator {

	public static void main(String[] args) {
		// Não permite itens duplicados
		// Existem dois tipos de set:
		// HashSet - Não mantém a ordem dos elementos. As operações de busca, adição e remoção de itens é mais r
		// TreeSet - Mantém a ordem dos elementos. A única vantagem é manter a ordem dos elementos
		
		Set setDeCoisasAleatorias = new HashSet();
		
		// Aceita diversos tipos dentro de uma mesmo set
		// NÃO É RECOMENDADO FAZER ISSO!
		setDeCoisasAleatorias.add("Texto legal");
		setDeCoisasAleatorias.add(123);
		setDeCoisasAleatorias.add(true);
		
		Set<String> setDeCpfs= new HashSet<String>();
		
		setDeCpfs.add("78945678900");
		setDeCpfs.add("47345678901");
		setDeCpfs.add("77745678902");
		setDeCpfs.add("02545678903");
		setDeCpfs.add("26545678904");
		setDeCpfs.add("89245678905");
		setDeCpfs.add("12345678906");
		setDeCpfs.add("12345678906");
		setDeCpfs.add("12345678906");
		setDeCpfs.add("12345678906");
		setDeCpfs.add("12345678906");
		setDeCpfs.add("12345678906");
		setDeCpfs.add("12345678906");
		
		setDeCpfs.remove("26545678904");
		
		Iterator<String> iteradorCpfs = setDeCpfs.iterator();
		
		// hasNext - Verifica se tem um próximo item na lista ou set
		while(iteradorCpfs.hasNext()) {
			System.out.println("CPF: " + iteradorCpfs.next());
		}
		
		
	}

}
