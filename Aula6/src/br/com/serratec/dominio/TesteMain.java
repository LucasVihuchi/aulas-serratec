package br.com.serratec.dominio;

import br.com.serratec.entidade.Assistente;
import br.com.serratec.entidade.Diretor;
import br.com.serratec.entidade.Funcionario;
import br.com.serratec.entidade.Gerente;
import br.com.serratec.interfaces.AutenticacaoFuncionarios;
import br.com.serratec.interfaces.Emprestimo;

public class TesteMain {

	public static void main(String[] args) {
//		Classes abstratas não podem ser instanciadas
//		Funcionario f1 = new Funcionario("Lucas", 3000);
		
		Funcionario f2 = new Assistente("Lucas", 3000.56, 500);
		Funcionario f3 = new Gerente("Gabriel", 8000.56);
		Funcionario f4 = new Diretor("Amanda", 16000, "TI");
		
		Emprestimo.verSaldoDisponivelNoBanco();
		
		AutenticacaoFuncionarios f5 = new Diretor("Amanda", 16000, "TI");
	}

}
