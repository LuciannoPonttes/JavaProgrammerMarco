package revisaoCriacaoProjeto;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		double primeiroNumeroDouble;// Variavel pagina (pag 36)
		double segundoNumeroDouble;
		double resultado;
		
		String primeiroNumeroString;
		String segundoNumeroString;
		
		
		
		Scanner entradaDados = new Scanner(System.in);// Criação e inicialização do objeto(pag 93)
		
		
		System.out.println("##Soma de Dois Numeros##");// Imprimir uma cadeia de caracteres para o usuario no console
		System.out.println("Digite o primeiro numero meu parceiro:");
		
		primeiroNumeroString = entradaDados.nextLine();
		
		primeiroNumeroDouble = Integer.parseInt(primeiroNumeroString); // Pag 195
		
		
		System.out.println("##################################");
		
		System.out.println("Digite o segundo numero meu parceiro:");
		
		segundoNumeroString = entradaDados.nextLine();
		
		segundoNumeroDouble = Integer.parseInt(segundoNumeroString);
		
		resultado = (primeiroNumeroDouble + segundoNumeroDouble);
		
		
		System.out.println("O resultado é:" + resultado  );
		
		
		
		//primeiroNumero = 10;// Atribuindo o valor para a variavel primeiroNumero (pag 96)
		
	}
}
