package entidades;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	//Metodo padrão de calcula de salario
	public Double calcularSalario() {
		double salario;
		
		salario = 7.5 * 176;// salario padrão
		
		return salario;
		
	}
	
}
