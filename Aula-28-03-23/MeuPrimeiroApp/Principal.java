import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;

class Principal{

	public static void main(String[] args){
		
		/*
		System.out.println("############Cadastro de Aluno###############");

		System.out.println("Digite o seu nome:");

		Scanner entradaDados = new Scanner(System.in);

		String nome = entradaDados.next();

		System.out.println("O nome digitado foi: ");
		System.out.println(nome);

		*/

		String path = "C:\\Users\\Administrador\\Documents\\JavaProgrammerMarco\\JavaProgrammerMarco\\Aula-28-03-23\\MeuPrimeiroApp-novo\\file.txt";

		
		try {
			escritor(path);
			System.out.println("Deu certo!!!");
		}catch (IOException e) {
			System.out.println("O erro é:"+ e);
		 
		}

		
		

	}

	public static void escritor(String path) throws IOException {
		
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	
	
	}


}