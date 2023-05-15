package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;
import validacao.ValidacaoJogador;

public class ControladorTelaCadastroJogador implements ActionListener {

	JTextField nomeRecebido;
	JTextField cpfRecebido;
	JTextField emailRecebido;
	
	
	
	
	public ControladorTelaCadastroJogador(JTextField nomeRecebido, JTextField cpfRecebido, JFrame menuPrincipalRecebido,
			JFrame telaCadastroJogadorecebido,RepositorioJogador repositorioJogador, JTextField textEmail) {
		
		this.nomeRecebido = nomeRecebido;
		this.cpfRecebido = cpfRecebido;
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.telaCadastroJogadorecebido = telaCadastroJogadorecebido;
		this.repositorioJogadorRecebido = repositorioJogador;
		this.emailRecebido = textEmail;
	}

	JFrame menuPrincipalRecebido;//para abrir
	JFrame telaCadastroJogadorecebido;// para fechar
	RepositorioJogador repositorioJogadorRecebido;
	ValidacaoJogador validacaoJogador = new ValidacaoJogador();
		
	boolean validaJogador = true;


	@Override
	public void actionPerformed(ActionEvent e) {
		if(popularJogador() != null) {
			repositorioJogadorRecebido.salvarJogador(popularJogador());
			menuPrincipalRecebido.setVisible(true);
			telaCadastroJogadorecebido.setVisible(false);
		}
	}

	public Jogador popularJogador() {
		
		Jogador jogador = new Jogador();
		
		
		validaJogador = validacaoJogador.validaEmail(emailRecebido.getText());
		
		
			if(validaJogador) {
				jogador.setEmail(emailRecebido.getText());
				jogador.setNome(nomeRecebido.getText());
				jogador.setCpf(cpfRecebido.getText());
				return jogador;
			}else {
				JOptionPane.showMessageDialog(null, "O email: " + emailRecebido.getText() + " não é valido!!");
				return null;
			}
	}
	
	
}
