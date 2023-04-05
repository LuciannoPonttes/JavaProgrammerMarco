package principal;

import java.util.Scanner;

import entidades.ProfessorSenior;
import servico.CalculaSalarioServico;

public class Principal {

	public static void main(String[] args) {
		
		Scanner recebeDadosString = new Scanner(System.in);
		ProfessorSenior proSenior = new ProfessorSenior();
		CalculaSalarioServico calcSalServico = new CalculaSalarioServico();
		
		System.out.println("##Cadastro de Professor##");
		System.out.println("***Cadastro de Seniorr***");
		
		System.out.println("Digite o nome do Professor Senior:");
		proSenior.nome = recebeDadosString.next();
		
		System.out.println("Digite o cpf do Professor Senior:");
		proSenior.cpf = recebeDadosString.next();
		
		System.out.println("Digite a quantidade de horas do Professor Senior:");
		proSenior.qtdHorasTrabalhadas = Integer.parseInt(recebeDadosString.next());
		
		proSenior.valorHoratrabalhada = 100;
		proSenior.irSenior = 10;
		
		proSenior.salarioBruto = calcSalServico.calcularSalarioBruto(proSenior.qtdHorasTrabalhadas, proSenior.valorHoratrabalhada);
				
		proSenior.salarioLiquido = calcSalServico.calcularSalarioLiquido(proSenior.salarioBruto , proSenior.irSenior);
		
		System.out.println("O Salario Bruto é:" + proSenior.salarioBruto);
		System.out.println("O Salario Liquido é:" + proSenior.salarioLiquido);
		
	}

}
