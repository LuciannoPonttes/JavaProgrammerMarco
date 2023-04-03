package principal;

import java.util.Scanner;
import entidades.ProfessorSenior;
import servico.SalarioServico;


public class Principal {
	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);// Classe do proprio JAVA
		ProfessorSenior proSenior = new ProfessorSenior();
		SalarioServico seSalarioServico = new SalarioServico();
		
		
		
		System.out.println("###Cadastro de Professor###");
		System.out.println("***Cadastro de Professor Senior***");
		System.out.println("Digite o nome do professor Senior:");
		proSenior.nome = entradaDados.next();
		System.out.println("Digite o cpf do professor Senior:");
		proSenior.cpf = entradaDados.next();
		System.out.println("Digite as horas do professor Senior:");
		proSenior.qtdHorasTrabalhadas = Integer.parseInt(entradaDados.next());
		
		proSenior.valorHoratrabalhada = 100;
		proSenior.irSenior = 10;
		
		//Calcular o salario Bruto
		proSenior.salarioBruto = seSalarioServico.calcularSalBruto(proSenior.qtdHorasTrabalhadas, proSenior.valorHoratrabalhada);
		//Calcular o salario Liquido
		proSenior.salarioLiquido = seSalarioServico.calcularSalLiquido(proSenior.salarioBruto, proSenior.irSenior);
		
		System.out.println("O salario do professor senior é:" + proSenior.salarioBruto);
		System.out.println("O salario Liquido do professor senior é:" + proSenior.salarioLiquido);
	}

	
}
