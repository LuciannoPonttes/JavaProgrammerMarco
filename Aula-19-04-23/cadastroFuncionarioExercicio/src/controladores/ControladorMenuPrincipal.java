package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.TelaMenuCoordenador;

public class ControladorMenuPrincipal implements ActionListener {

	// Variaveis locais
	JTextField textRespostaRecebida;
	JFrame frameMenuPrincipalRecebido;
	
	
	//Objetos inicializados
	
	TelaMenuCoordenador telaMenuCoordenador = new TelaMenuCoordenador();
	
	
	public ControladorMenuPrincipal(JTextField textRespostaParametro, JFrame frameMenuPrincipal) {
		this.textRespostaRecebida = textRespostaParametro;
		this.frameMenuPrincipalRecebido = frameMenuPrincipal;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String resposta = textRespostaRecebida.getText();
		
		if (resposta.equals("1") || resposta.equals("2") ) {
			
			switch (resposta) {
				case "1":
					telaMenuCoordenador.criarTelaMenuCoordenador();
					frameMenuPrincipalRecebido.setVisible(false);
					
				break;
				
				case "2":
					System.out.println("Menu Atendente");
				break;
				
			}
		
		}else {
			JOptionPane.showMessageDialog(null, "Opção Invalida!!!");
		}
		
	}

}
