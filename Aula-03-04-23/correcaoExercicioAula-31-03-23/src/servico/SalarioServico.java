package servico;

public class SalarioServico {

	// Retorna o salario Bruto
	public double calcularSalBruto(int qtdHoraTrabalhada, double valorHora){
		
		double salarioTemp;
		salarioTemp = valorHora * qtdHoraTrabalhada;
		
		
		return salarioTemp;
	}
	
	//Retorna o salario liquido
	public double calcularSalLiquido(double salBruto, double descontoIr) {
		
		double porcentagem = descontoIr /100;
		double valorDesconto = salBruto * porcentagem;
		
		double salLiquido = salBruto - valorDesconto;
		
		
		
		return salLiquido;
	}
}
