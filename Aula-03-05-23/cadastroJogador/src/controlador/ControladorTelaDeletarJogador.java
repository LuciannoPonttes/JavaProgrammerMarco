package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;

public class ControladorTelaDeletarJogador implements ActionListener {

	JFrame menuPrincipalRecebido;
	JFrame frameDeletarRecebido;
	
	RepositorioJogador repositorioJogadorRecebido;
	JTextField textcpfRedebido;
	
	
	public ControladorTelaDeletarJogador(JFrame menuPrincipalRecebido, JFrame frameDeletarRecebido,
			RepositorioJogador repositorioJogadorRecebido, JTextField textcpfRedebido) {
	
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.frameDeletarRecebido = frameDeletarRecebido;
		this.repositorioJogadorRecebido = repositorioJogadorRecebido;
		this.textcpfRedebido = textcpfRedebido;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		String botao = e.getActionCommand();
		
		if(botao == "Deletar") {
			Jogador jogadorDelete = new Jogador();
			
			jogadorDelete = repositorioJogadorRecebido.buscarJogador(textcpfRedebido.getText());
			
			if(jogadorDelete != null) {
				repositorioJogadorRecebido.deletarJogador(jogadorDelete);
				JOptionPane.showMessageDialog(null, "Jogador foi Deletado");
				frameDeletarRecebido.setVisible(false);
				menuPrincipalRecebido.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Jogador não encontrado");
			}
			
		}else{
			frameDeletarRecebido.setVisible(false);
			menuPrincipalRecebido.setVisible(true);
			
		}
	}
	
}
