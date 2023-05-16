package validacao;

import entidades.Jogador;

public class MensagemErroValidacaoJogador {
    
	
	public String retornaMensagemErro(Jogador jogador) {
		ValidaEntidade validaEntidade = new ValidaEntidade();
		
		String mensagemErro = null;
		
		//Valido o email
		if(!validaEntidade.validaEmail( jogador.getEmail())) {
			
			mensagemErro = "O email: " + jogador.getEmail() + " não é valido!!";
			return mensagemErro;
		}
		
		if(!validaEntidade.validaCpf(jogador.getCpf())) {
			
			mensagemErro = "O cpf: " + jogador.getCpf() + " não é valido!!";
			return mensagemErro;
			
		}
		
		if(!validaEntidade.validaNome(jogador.getNome())) {
			mensagemErro = "O nome: " + jogador.getNome() + " não é valido!!";
			return mensagemErro;
			
		}
		
		if(!validaEntidade.verificaCpfRepetido(jogador.getCpf())) {
			
			mensagemErro = "O cpf: " + jogador.getCpf() + " já existe!!";
			return mensagemErro;
			
		}
		
		
		return null;
		
		
	}
	
}
