package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;

public class ControladorTelaCadastroJogador implements ActionListener {

	JTextField nomeRecebido;
	JTextField cpfRecebido;
	
	JFrame menuPrincipalRecebido;//para abrir
	JFrame telaCadastroJogadorecebido;// para fechar
	RepositorioJogador repositorioJogadorRecebido;
	
	
	public ControladorTelaCadastroJogador(JTextField nomeRecebido, JTextField cpfRecebido, JFrame menuPrincipalRecebido,
			JFrame telaCadastroJogadorecebido,RepositorioJogador repositorioJogador) {
		
		this.nomeRecebido = nomeRecebido;
		this.cpfRecebido = cpfRecebido;
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.telaCadastroJogadorecebido = telaCadastroJogadorecebido;
		this.repositorioJogadorRecebido = repositorioJogador;
	}

	


	@Override
	public void actionPerformed(ActionEvent e) {
		repositorioJogadorRecebido.salvarJogador(popularJogador());
		
		menuPrincipalRecebido.setVisible(true);
		telaCadastroJogadorecebido.setVisible(false);
		
	}

	public Jogador popularJogador() {
		
		Jogador jogador = new Jogador();
		jogador.setNome(nomeRecebido.getText());
		jogador.setCpf(cpfRecebido.getText());
		
		return jogador;
	}
	
	
}
