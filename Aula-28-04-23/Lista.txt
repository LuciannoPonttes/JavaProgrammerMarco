package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;

public class Pagina {

	public static void main(String[] args) {
	
		List<Pessoa> listaPessoas = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		String resposta = null;
		Boolean resultado = true;
		
		do {
			
			System.out.println("1 para cadastrar - 2 para sair");
			resposta = entrada.nextLine();
			
			switch (resposta) {
			case "1": 
				Pessoa pessoaRecebida = new Pessoa();
				
				System.out.println("Digite o nome: ");		
				pessoaRecebida.setNome(entrada.nextLine());
				
				System.out.println("Digite o cpf: ");		
				pessoaRecebida.setCpf(entrada.nextLine());
				
				listaPessoas.add(pessoaRecebida);
				
				break;
			
			case "2":
				resultado = false;
				break;
			}
		}while(resultado);
		
		for (Pessoa pessoaItem: listaPessoas) {
			System.out.println(pessoaItem.getNome());
			System.out.println(pessoaItem.getCpf());
			System.out.println("########################################");
			
			
		}

	}

}
