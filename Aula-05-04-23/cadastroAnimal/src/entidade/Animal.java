package entidade;

public class Animal {
	
	private String nome;
	private int idade;
	
	// Envia o valor da variavel nome
	public String getNome() {
		return this.nome;	// retorna o valor da variavel nome
	}
	
	//Recebe o valor da variavel nome
	public void setNome(String nomeRecebido) {
		this.nome = nomeRecebido; // Insere o valor na variavel nome
	} 
}
