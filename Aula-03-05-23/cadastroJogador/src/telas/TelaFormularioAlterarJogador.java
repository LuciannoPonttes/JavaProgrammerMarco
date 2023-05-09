package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorFormularioAlterarJogador;
import controlador.ControladordentificaAlterarJogador;
import entidades.Jogador;
import repositorio.RepositorioJogador;

public class TelaFormularioAlterarJogador {

	public void formularioAlterarJogador(Jogador jogadorEncontrado, JFrame frameMenuPrincipal, RepositorioJogador repositorioJogadorRecebido) {
		
		String nome = "Digite o nome";
		String cpf = "Digite o cpf";
		
		JFrame frameFormularioAlterarJogador = new JFrame();
		frameFormularioAlterarJogador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFormularioAlterarJogador.setSize(400, 250);
		
		JPanel panelFormularioAlterar = new JPanel();
		GridLayout grid = new GridLayout (0,1);
		panelFormularioAlterar.setLayout(grid);
		
		JLabel labelNome = new JLabel(nome);
		panelFormularioAlterar.add(labelNome);
		
		JTextField textNome = new  JTextField(10);
		textNome.setText(jogadorEncontrado.getNome());//Adicionar o nome do jogador encontrado no Campo de texto do nome
		panelFormularioAlterar.add(textNome);
		
		JLabel labelCpf = new JLabel(cpf);
		panelFormularioAlterar.add(labelCpf);
		
		JTextField textCpf = new  JTextField(10);
		textCpf.setText(jogadorEncontrado.getCpf());//Adiciona o cpf do jogador encontrado no Campo de texto do nome
		panelFormularioAlterar.add(textCpf);
		
		JButton buttonTelaCadastroJogador = new JButton("Alterar Jogador");
		panelFormularioAlterar.add(buttonTelaCadastroJogador);
		frameFormularioAlterarJogador.add(panelFormularioAlterar);
		frameFormularioAlterarJogador.setVisible(true);
		
		ControladorFormularioAlterarJogador controladorFormularioAlterarJogador = new ControladorFormularioAlterarJogador(frameMenuPrincipal, frameFormularioAlterarJogador, textNome, textCpf, repositorioJogadorRecebido, jogadorEncontrado);
		buttonTelaCadastroJogador.addActionListener(controladorFormularioAlterarJogador);
		
	}
	
}
