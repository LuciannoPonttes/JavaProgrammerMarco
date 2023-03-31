package meuPrimeiroProjetoEclipse;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializar o objeto mamifero
		Mamifero mamiferoUm = new Mamifero();
		
		//Inicializar a ave
		Ave aveUm = new Ave();
		
		// Objeto para receber dados atraves do console
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("##Cadastro e Animal!!##");
		
		System.out.println("Digite o nome do Mamifero:");
		mamiferoUm.nome = entradaDados.next();
		
		System.out.println("Digite a especie do Mamifero:");
		mamiferoUm.especie = entradaDados.next();
		
		System.out.println("Digite a cor do pelo do Mamifero:");
		mamiferoUm.corPelo = entradaDados.next();
		
		
		
		System.out.println("A especie do mamifero é:");
		System.out.println(mamiferoUm.especie);
		
		System.out.println("A cor do pelo do mamifero é:");
		System.out.println(mamiferoUm.corPelo);
		
		System.out.println("O nome do mamifero é:");
		System.out.println(mamiferoUm.nome);
		
		System.out.println("##########Cadastro de Ave ###########");

		System.out.println("Digite o nome da Ave:");
		aveUm.nome = entradaDados.next();

		System.out.println("Digite a especie da Ave:");
		aveUm.especie = entradaDados.next();

		System.out.println("Digite a cor da pena da Ave:");
		aveUm.corPena = entradaDados.next();
		
		System.out.println("O nome da Ave é:");
		System.out.println(aveUm.nome);
		System.out.println("A especie da Ave é:");
		System.out.println(aveUm.especie);
		System.out.println("A cor da pena da ave é:");
		System.out.println(aveUm.corPena);

		

	}
	
	

}
