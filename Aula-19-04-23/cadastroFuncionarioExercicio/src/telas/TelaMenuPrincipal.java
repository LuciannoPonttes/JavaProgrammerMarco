package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuPrincipal;

public class TelaMenuPrincipal {
	public void criarTelaMenuPrincipal() {
		
		String opcao1 = "1 -  Menu Coordenador";
		String opcao2 = "2 - Menu Atendente";
		
		JFrame frameMenuPrincipal = new JFrame();
		frameMenuPrincipal.setSize(200,200);
		frameMenuPrincipal.setTitle("Menu Principal");
		
		JPanel panelMenuPrincipal = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuPrincipal.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuPrincipal.add(labelOpcao2);
		
		JTextField textReposta = new JTextField(10);
		panelMenuPrincipal.add(textReposta);
		
		JButton buttonEnviar = new JButton("Enviar");
		panelMenuPrincipal.add(buttonEnviar);
		
		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
		
		ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(textReposta, frameMenuPrincipal);
		buttonEnviar.addActionListener(controladorMenuPrincipal);
		
		
		
	}
}
