package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaMenuJogador;

public class TelaMenuJogador {

	//fora do metodo somente variaveis
	
	public void criarTelaMenuJogador() {
		
		String opcao1 = "Digite 1 - para Cadastrar";
		String opcao2 = "Digite 2 - para Listar";
		String opcao3 = "Digite 3 - para Deletar";
		
		JFrame frameTelaMenuJogador = new JFrame();
		frameTelaMenuJogador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTelaMenuJogador.setSize(400, 250);
		
		JPanel panelTelaMenuJogador = new JPanel();
		
		GridLayout grid = new GridLayout (0,1);
		panelTelaMenuJogador.setLayout(grid);
		
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelTelaMenuJogador.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelTelaMenuJogador.add(labelOpcao2);
		
		JLabel labelOpcao3 = new JLabel(opcao3);
		panelTelaMenuJogador.add(labelOpcao3);
		
		JTextField textRespostaTelaMenuJogador = new JTextField(10);
		panelTelaMenuJogador.add(textRespostaTelaMenuJogador);
		
		JButton buttonEnviarTelaMenuJogador = new JButton("Enviar");
		panelTelaMenuJogador.add(buttonEnviarTelaMenuJogador);
		
		frameTelaMenuJogador.add(panelTelaMenuJogador);
		frameTelaMenuJogador.setVisible(true);
		
		ControladorTelaMenuJogador controladorTelaMenuJogador = new ControladorTelaMenuJogador(frameTelaMenuJogador, textRespostaTelaMenuJogador);
		buttonEnviarTelaMenuJogador.addActionListener(controladorTelaMenuJogador);
		
	}
	
	
}
