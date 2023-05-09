package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;
import telas.TelaFormularioAlterarJogador;

public class ControladordentificaAlterarJogador implements ActionListener {

	
	JFrame menuPrincipalRecebido;
	JFrame frameAlterarRecebido;
	
	RepositorioJogador repositorioJogadorRecebido;
	JTextField textcpfRedebido;
	

	
	public ControladordentificaAlterarJogador(JFrame menuPrincipalRecebido, JFrame frameAlterarRecebido,
			RepositorioJogador repositorioJogadorRecebido, JTextField textcpfRedebido) {
		super();
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.frameAlterarRecebido = frameAlterarRecebido;
		this.repositorioJogadorRecebido = repositorioJogadorRecebido;
		this.textcpfRedebido = textcpfRedebido;
	}
	
	TelaFormularioAlterarJogador formularioAlterarJogador = new TelaFormularioAlterarJogador();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String botao = e.getActionCommand();// Identifica qual botão foi pressionado
		
		//Quando o botão alterar for acionado!!
		if(botao.equals("Alterar")) {
			Jogador jogadorAlterar = new Jogador();//Inicializa o jogador que vai ser alterado
			
			//Armazena o jogador que foi encontrado na lista(Retorna null se não encontrar)
			jogadorAlterar = repositorioJogadorRecebido.buscarJogador(textcpfRedebido.getText());
			
			//Se o jogador for encontrado(diferente de null)
			if(jogadorAlterar != null) {
				
			
				//Abre o formulario de edição passando o jogador encontrado como parametro
				formularioAlterarJogador.formularioAlterarJogador(jogadorAlterar, menuPrincipalRecebido, repositorioJogadorRecebido);
				//Fecha a tela de selecionar o jogador que vai ser alterado
				frameAlterarRecebido.setVisible(false);
				
			}else {
				//Caso não encontre o jogador
				JOptionPane.showMessageDialog(null, "O jogador não foi encontrado");
			}
			
		}
		
		//Quando o botão Voltar for acionado
		if(botao.equals("Voltar")) {
			menuPrincipalRecebido.setVisible(true);
			frameAlterarRecebido.setVisible(false);
		
		}
		
	}

}
