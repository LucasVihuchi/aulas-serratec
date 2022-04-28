package teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class arquivos {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("teste.txt");
		
		FileReader leitor = null;
		try {
			arquivo.createNewFile();
			leitor = new FileReader(arquivo);
		} catch (IOException e) {
			System.out.println("Deu erro");
		}
		
		BufferedReader bfReader = new BufferedReader(leitor);

	}
}
