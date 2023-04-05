package servico;

public class CalculaSalarioServico {

	
	// Calcular o bruto
	public double calcularSalarioBruto(int qtdHorasTrabalhadas, double valorHoraTrabalhada ) {
		
		double salarioBrutoTemp = qtdHorasTrabalhadas * valorHoraTrabalhada;
		double valorBonus =  25;
		double porcentagemBonus = valorBonus / 100;
		double valorDoBonus = salarioBrutoTemp * porcentagemBonus;
		
		
		if(qtdHorasTrabalhadas > 500) {
			
			salarioBrutoTemp = salarioBrutoTemp + valorDoBonus;
			
		}
		
		
		
		return salarioBrutoTemp;
		
	}
	
	
	
	
	//Calcular o liquido
	public double calcularSalarioLiquido(double salBrutoTemp, double irSeniorTemp) {
	
		double porcentagem = irSeniorTemp / 100;
		
		double desconto = salBrutoTemp * porcentagem;
		
		double salarioLiquido = salBrutoTemp - desconto;
		
		
		return salarioLiquido;
		
	}
	
	
	
}
