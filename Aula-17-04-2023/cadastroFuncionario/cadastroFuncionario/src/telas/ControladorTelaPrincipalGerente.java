package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControladorTelaPrincipalGerente implements ActionListener {
	JTextField textRespostaRecebida;
	JFrame frameRecebido;
	
	TelaCadastroGerente telaCadastroGerente = new TelaCadastroGerente();
	
	
	
	public ControladorTelaPrincipalGerente(JTextField textRespostaRecebida, JFrame frameRecebido) {
		this.textRespostaRecebida = textRespostaRecebida;
		this.frameRecebido = frameRecebido;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String opcao = textRespostaRecebida.getText();
		
		if(opcao.equals("1") || opcao.equals("2")) {
			switch (opcao) {
			case "1":
				
				telaCadastroGerente.telaCadastrarGerente();
				frameRecebido.setVisible(false);
				break;
			case "2":
				System.out.println("Abrir Visualizar");
				break;
			
				
			
			}
		}
	}
}
