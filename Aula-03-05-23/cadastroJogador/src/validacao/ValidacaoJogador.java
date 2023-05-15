package validacao;

import javax.mail.internet.InternetAddress;

public class ValidacaoJogador {

	public boolean validaEmail(String email) {
		
		boolean resultado = true;
		
		try {
			
			InternetAddress enderecoEmail = new InternetAddress(email);
			enderecoEmail.validate();
			
		} catch (Exception e) {
			resultado = false;
			System.out.println("email invalido");
		}
		
		return resultado;
		
	}
	
	
	
}
