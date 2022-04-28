package br.com.serratec;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMaps {

	public static void main(String[] args) {
		Map<String, Pessoa> mapaPessoas = new HashMap<String, Pessoa>();

		// Insere pessoas no mapa
		Pessoa gabriel = new Pessoa("Gabriel", "12345678900");
		mapaPessoas.put("12345678900", gabriel);
		Pessoa amanda = new Pessoa("Amanda", "55566677788");
		mapaPessoas.put("55566677788", amanda);

		// Só insere se a chave não tiver outro valor associado
		mapaPessoas.putIfAbsent("12345678900", new Pessoa("Heitor", "33344455588"));

		// keySet() Pega todos as chaves do mapa
		for (String cpf : mapaPessoas.keySet()) {
			System.out.println("CPF: " + cpf);
		}

		// .values() Pega todos os valores do mapa
		for (Pessoa pessoaAtual : mapaPessoas.values()) {
			System.out.println("Pessoa: " + pessoaAtual);
		}

		// Pega uma pessoa do mapa
		System.out.println("Pessoa que pesquisei com o get: " + mapaPessoas.get("12345678911"));

		// Pega uma pessoa do mapa, se não encontrar, retorna o valor padrão
		System.out.println("Pessoa que pesquisei com o getOrDefault: "
				+ mapaPessoas.getOrDefault("12345678911", new Pessoa("Mr. Anderson", "00000000000")));

		// Verifica se valor(Pessoa) já existe
		if (mapaPessoas.containsValue(amanda)) {
			System.out.println("Amanda já cadastrada");
		} else {
			System.out.println("Amanda não tem cadastro");
		}

		// Verifica se chave existe
		if (mapaPessoas.containsKey("55566677788")) {
			System.out.println("Cpf da amanda já cadastrado");
		} else {
			System.out.println("Cpf da amanda não cadastrado");
		}

		// Remove só com a chave
//		mapaPessoas.remove("55566677788");
		
		// Remove com a chave e valor (Mais seguro)
		mapaPessoas.remove("55566677788", amanda);
		
		// Não cria um registro novo se não existir anteriormente
		mapaPessoas.replace("3333333333", new Pessoa("Heitor", "33344455588"));
		
		//Replace mais Seguro
		mapaPessoas.replace("12345678900", gabriel, new Pessoa("Heitor", "33344455588"));

		System.out.println("\n\nLista Atualizada de pessoas: ");
		for (Pessoa pessoaAtual : mapaPessoas.values()) {
			System.out.println("Pessoa: " + pessoaAtual);
		}

	}

}
