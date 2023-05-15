package telas;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaCadastroJogador;
import repositorio.RepositorioJogador;

public class TelaCadastroJogador {
	
	public void criarTelaCadastroJogador(JFrame menuPrincipal, RepositorioJogador repositorioJogador) {
		
		String cpf = "DIGITE O CPF:";
		String nome = "DIGITE O NOME:";
		String email = "DIGITE O EMAIL:";
		
		
		JFrame frameTelaCadastroJogador = new JFrame();
		frameTelaCadastroJogador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTelaCadastroJogador.setSize(400, 250);
		
		JPanel panelTelaCadastroJogador = new JPanel();
		GridLayout grid = new GridLayout (0,1);
		panelTelaCadastroJogador.setLayout(grid);
		
		JLabel labelCpf = new JLabel(cpf);
		panelTelaCadastroJogador.add(labelCpf);
		
		JTextField textCpf = new  JTextField(10);
		panelTelaCadastroJogador.add(textCpf);
		
		JLabel labelNome = new JLabel(nome);
		panelTelaCadastroJogador.add(labelNome);
		
		JTextField textNome = new  JTextField(10);
		panelTelaCadastroJogador.add(textNome);
		
		JLabel labelEmail = new JLabel(email);
		panelTelaCadastroJogador.add(labelEmail);
		
		JTextField textEmail = new  JTextField(10);
		panelTelaCadastroJogador.add(textEmail);
		
		
		
		JButton buttonTelaCadastroJogador = new JButton("Enviar");
		panelTelaCadastroJogador.add(buttonTelaCadastroJogador);
		frameTelaCadastroJogador.add(panelTelaCadastroJogador);
		frameTelaCadastroJogador.setVisible(true);
		
		ControladorTelaCadastroJogador controladorTelaCadastroJogador = new ControladorTelaCadastroJogador(textNome, textCpf, menuPrincipal, frameTelaCadastroJogador, repositorioJogador, textEmail);
		buttonTelaCadastroJogador.addActionListener(controladorTelaCadastroJogador);
	}
}
