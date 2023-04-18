package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorTelaPrincipal implements ActionListener {

	//Objetos da classe
	JTextField textRespostaRecebida;
	JFrame frameMenuPrincipalRecebido;
	
	
	
	TelaPrincipalGerente telaPrincipalGerente = new TelaPrincipalGerente();
	
	
	public ControladorTelaPrincipal(JTextField textResposta, JFrame frameMenuPrincipal) {
		this.textRespostaRecebida = textResposta;
		this.frameMenuPrincipalRecebido = frameMenuPrincipal;
	}

	

	//Metodo acionado quando o botão é pressionado
	@Override
	public void actionPerformed(ActionEvent e) {
			String textoResposta = textRespostaRecebida.getText();
			
			if(textoResposta.equals("1") || textoResposta.equals("2") || textoResposta.equals("3")) {
				
				switch (textoResposta) {
				case "1":
					telaPrincipalGerente.menuGerente();
					frameMenuPrincipalRecebido.setVisible(false);
					
					break;
				case "2":
					System.out.println("Escolheu cadastrar Coordenador");
					break;
				case "3":
					System.out.println("Escolheu cadastrar Gerente");
					break;
			
			
			
				}
			}else {
				JOptionPane.showMessageDialog(null, "Opção Invalida!!!!!");
			}
			
				
	}

}
