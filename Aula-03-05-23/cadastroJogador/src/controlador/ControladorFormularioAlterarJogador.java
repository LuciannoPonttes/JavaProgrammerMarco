package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;

public class ControladorFormularioAlterarJogador implements ActionListener {

	
	JFrame frameMenuInicial;
	JFrame frameFormularioAlterar;
	JTextField textNomeRecebido;
	JTextField textCpfRecebido;
	RepositorioJogador repositorioJogadorRecebido;
	Jogador jogadorAtual;
	
	
	


	public ControladorFormularioAlterarJogador(JFrame frameMenuInicial, JFrame frameFormularioAlterar,
			JTextField textNomeRecebido, JTextField textCpfRecebido, RepositorioJogador repositorioJogadorRecebido,
			Jogador jogadorAtual) {
		this.frameMenuInicial = frameMenuInicial;
		this.frameFormularioAlterar = frameFormularioAlterar;
		this.textNomeRecebido = textNomeRecebido;
		this.textCpfRecebido = textCpfRecebido;
		this.repositorioJogadorRecebido = repositorioJogadorRecebido;
		this.jogadorAtual = jogadorAtual;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		
		repositorioJogadorRecebido.alterarJogador(popularJogadorNovo());
		
		frameMenuInicial.setVisible(true);
		
		frameFormularioAlterar.setVisible(false);
	}
	
	public Jogador popularJogadorNovo() {
		Jogador jogadorNovo = new Jogador();
		
		jogadorNovo.setNome(textNomeRecebido.getText());
		jogadorNovo.setCpf(textCpfRecebido.getText());
		
		return jogadorNovo;
	}

}
