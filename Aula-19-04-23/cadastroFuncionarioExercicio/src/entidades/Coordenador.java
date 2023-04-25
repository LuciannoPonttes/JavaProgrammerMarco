package entidades;

public class Coordenador extends Pessoa {
	private String coordenacao;

	public String getCoordenacao() {
		return coordenacao;
	}

	public void setCoordenacao(String coordenacao) {
		this.coordenacao = coordenacao;
	}

	public Coordenador(String coordenacao) {
		super();
		this.coordenacao = coordenacao;
	}

	public Coordenador() {
		super();
	}

	@Override // SobreEscreve o metodo calcularSalario da classe Pessoa(Pai)
	public Double calcularSalario() {
		double salario;
		
		salario = 50.0 * 176;// salario padrão
		
		return salario;
	}
	
	
	
	
	
	
	
}
