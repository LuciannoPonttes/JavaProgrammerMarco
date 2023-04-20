package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuCoordenador;
import controladores.ControladorMenuPrincipal;

public class TelaMenuCoordenador {

	public void criarTelaMenuCoordenador() {
	
		String opcao1 = "1 -  Cadastrar Coordenador";
		String opcao2 = "2 - Voltar";
		
		JFrame frameMenuCoordenador = new JFrame();
		frameMenuCoordenador.setSize(200,200);
		frameMenuCoordenador.setTitle("Menu Coordenador");
		
		JPanel panelMenuCoordenador = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuCoordenador.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuCoordenador.add(labelOpcao2);
		
		JTextField textRepostaMenuCoordenador = new JTextField(15);
		panelMenuCoordenador.add(textRepostaMenuCoordenador);
		
		JButton buttonEnviar = new JButton("Enviar");
		panelMenuCoordenador.add(buttonEnviar);
		
		ControladorMenuCoordenador controladorMenuCoordenador = new ControladorMenuCoordenador(textRepostaMenuCoordenador, frameMenuCoordenador );
		buttonEnviar.addActionListener(controladorMenuCoordenador);
		
		frameMenuCoordenador.add(panelMenuCoordenador);
		frameMenuCoordenador.setVisible(true);
		
	}
	
}
