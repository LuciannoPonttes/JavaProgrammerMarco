package calcularSalarioAtleta;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		// Objeto jogador de futebol
		JogadorFutebol joFutebol = new JogadorFutebol();
		JogadorVolei joVolei = new JogadorVolei();
		
		
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		System.out.println("******Cadastro de Atleta********");
		
		System.out.println("#####Cadastro de Jogador de Futebol######");
		
		System.out.println("Digite o nome do Jogador de Futebol:");
		joFutebol.nome = entradaDeDados.next();
		
		System.out.println("Digite a idade do Jogador de Futebol:");
		joFutebol.idade = Integer.parseInt(entradaDeDados.next());
		
		System.out.println("Digite a quantidade de partidas do Jogador de Fut:");
		joFutebol.qtdPartidas = Integer.parseInt(entradaDeDados.next());
		
		System.out.println("Digite a quantidade de gols do Jogador de Fut:");
		joFutebol.qtdGol = Integer.parseInt(entradaDeDados.next());
		
		//Chama o metodo para calcular o salario
		joFutebol.salario = calcularSalario(joFutebol.qtdGol, joFutebol.qtdPartidas, 1000);
		
		System.out.println("O salario do jogador é:" + joFutebol.salario);
		
		
		System.out.println("#####Cadastro de Jogador de Volei######");
		
		System.out.println("Digite o nome do Jogador de Volei:");
		joVolei.nome = entradaDeDados.next();
		
		System.out.println("Digite a idade do Jogador de Volei:");
		joVolei.idade = Integer.parseInt(entradaDeDados.next());
		
		System.out.println("Digite a quantidade e partidas do Jogador de Volei:");
		joVolei.qtdPartidas = Integer.parseInt(entradaDeDados.next());
		
		System.out.println("Digite a quantidade de pontos");
		joVolei.qtdPonto = Integer.parseInt(entradaDeDados.next());
		
		joVolei.salario = calcularSalario(joVolei.qtdPonto, joVolei.qtdPartidas, 500);
		
		
		System.out.println("O salario do jogador de volei é:" + joVolei.salario);
		
	}
	
	
	// Criar metodo para calcular salario
	public static double calcularSalario(int qtdDesempenhoTemp, int qtdPartidaTemp, double multiplicador ) {
		double salarioTemp = (qtdDesempenhoTemp + qtdPartidaTemp) * multiplicador;
				
		return salarioTemp;
	}

}
