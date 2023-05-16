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
		
		
		
		
		return null;
		
		
	}
	
}
