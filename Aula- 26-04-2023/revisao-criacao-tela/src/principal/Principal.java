package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import telas.TelaMenuPrincipal;

public class Principal {
	public static void main(String[] args) {
		
		//TelaMenuPrincipal telaMenuPrincipal_1 = new TelaMenuPrincipal();
		
		//telaMenuPrincipal_1.executarMenuPrincipal();
		
		Scanner entrada = new Scanner(System.in);
		 
		//Criar uma lista do tipo pessoa
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		String resposta = null;
		Boolean result = true;
		do {
			
			System.out.println("Digite 1 para cadastrar Pessoa - 2 Para sair");
			resposta  = entrada.nextLine();
			
			switch (resposta) {
			case "1":
				Pessoa pessoa_recebida = new Pessoa(); 
				
				System.out.println("Digite o nome:");
				pessoa_recebida.setNome(entrada.nextLine());
				System.out.println("Digite o cpf:");
				pessoa_recebida.setCpf(entrada.nextLine());
				
				listaPessoas.add(pessoa_recebida);
				
				break;
			case "2":
				result = false;
				break;
			}
		} while (result);
		
		
		
		for(Pessoa pessoaItem: listaPessoas) {
			System.out.println(pessoaItem.getNome());
			System.out.println(pessoaItem.getCpf());
			System.out.println("#########################");
			
		}
	}	
}
