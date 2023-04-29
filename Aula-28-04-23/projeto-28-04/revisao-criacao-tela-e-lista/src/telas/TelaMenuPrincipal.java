package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controlador.ControladorMenuPrincipal;

public class TelaMenuPrincipal {

	
	
	
	public void executarMenuPrincipal() {
		
		String opcao1MenuPrincipal = " Digite 1 para cadastrar";
		String opcao2MenuPrincipal = " Digite 2 Listar";
		
		
		GridLayout grid = new GridLayout (0,1);
		
		
		JFrame frameMenuPrincipal = new JFrame();//Criação do Frame
		frameMenuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenuPrincipal.setSize(400, 250);
		
		JPanel panelMenuPrincipal = new JPanel();//Criação do painel
		panelMenuPrincipal.setLayout(grid);
		
		JLabel labelOpcao1 = new JLabel(opcao1MenuPrincipal);
		panelMenuPrincipal.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2MenuPrincipal);
		panelMenuPrincipal.add(labelOpcao2);
		
		
	
		JTextField textResposta = new JTextField(10);
		panelMenuPrincipal.add(textResposta);
		
		JButton buttonEnviarMenuPrincipal = new JButton("Enviar");
		panelMenuPrincipal.add(buttonEnviarMenuPrincipal);
		
		ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(textResposta, frameMenuPrincipal);
		
		buttonEnviarMenuPrincipal.addActionListener(controladorMenuPrincipal);
		
		
		frameMenuPrincipal.add(panelMenuPrincipal);
		frameMenuPrincipal.setVisible(true);
			
	}
	
	
	
}
