package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorMenuCoordenador;
import controladores.ControladorMenuPrincipal;

public class TelaMenuCoordenador {

	public void criarTelaMenuCoordenador(JFrame menuPrincipal) {
	
		String opcao1 = "1 -  Cadastrar Coordenador";
		
		String opcao2 = "2 -  Listar Coordenadores";
		
		String opcao3 = "3 -  Deletar Coordenador";
		
		String opcao4 = "4 -  Editar Coordenador";
		
		
		String opcao5 = "5 - Menu Principal";
		
		JFrame frameMenuCoordenador = new JFrame();
		frameMenuCoordenador.setSize(200,200);
		frameMenuCoordenador.setTitle("Menu Coordenador");
		
		JPanel panelMenuCoordenador = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenuCoordenador.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenuCoordenador.add(labelOpcao2);
		
		JLabel labelOpcao3 = new JLabel(opcao3);
		panelMenuCoordenador.add(labelOpcao3);
		
		JLabel labelOpcao4 = new JLabel(opcao4);
		panelMenuCoordenador.add(labelOpcao4);
		
		JLabel labelOpcao5 = new JLabel(opcao5);
		panelMenuCoordenador.add(labelOpcao5);
		
		JTextField textRepostaMenuCoordenador = new JTextField(15);
		panelMenuCoordenador.add(textRepostaMenuCoordenador);
		
		JButton buttonEnviar = new JButton("Enviar");
		panelMenuCoordenador.add(buttonEnviar);
		
		ControladorMenuCoordenador controladorMenuCoordenador = new ControladorMenuCoordenador(textRepostaMenuCoordenador, frameMenuCoordenador, menuPrincipal );
		buttonEnviar.addActionListener(controladorMenuCoordenador);
		
		frameMenuCoordenador.add(panelMenuCoordenador);
		frameMenuCoordenador.setVisible(true);
		
	}
	
}
