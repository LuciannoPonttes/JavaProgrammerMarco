package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Jogador;
import entidades.Usuario;
import repositorio.RepositorioJogador;
import telas.TelaCadastroJogador;
import telas.TelaDeletarJogador;
import telas.TelaIndentificaAlterarJogador;
import telas.TelaListarJogador;

public class ControladorTelaMenuJogador implements ActionListener {

	JFrame frameTelaMenuPrincipal;
	JTextField respostaTelaMenuPrincipal;
	
	Usuario usuarioRecebido;
	
	public ControladorTelaMenuJogador(JFrame frameTelaMenuPrincipal, 
			JTextField respostaTelaMenuPrincipal, Usuario usuarioEncontrado) {
		this.frameTelaMenuPrincipal = frameTelaMenuPrincipal;
		this.respostaTelaMenuPrincipal = respostaTelaMenuPrincipal;
		this.usuarioRecebido = usuarioEncontrado;
	}
	
	TelaCadastroJogador telaCadastroJogador = new TelaCadastroJogador();
	TelaListarJogador telaListarJogador = new TelaListarJogador();
	TelaDeletarJogador deletarJogador = new TelaDeletarJogador();
	TelaIndentificaAlterarJogador telaIndentificaAlterarJogador = new TelaIndentificaAlterarJogador();
	
	RepositorioJogador repositorioJogador = new RepositorioJogador();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String resposta = respostaTelaMenuPrincipal.getText();
		
		switch (resposta) {
			case "1": 
				
				telaCadastroJogador.criarTelaCadastroJogador(frameTelaMenuPrincipal,repositorioJogador);
				frameTelaMenuPrincipal.setVisible(false);
				
				break;
			case "2": 
				
				telaListarJogador.listarJogador(repositorioJogador.retornaListaJogadores(), frameTelaMenuPrincipal);
				frameTelaMenuPrincipal.setVisible(false);
				
				break;
			case "3": 
				
				if(usuarioRecebido.getTipoUsuario().equals("ADM")) {
					deletarJogador.deletarJogador(repositorioJogador.retornaListaJogadores(), frameTelaMenuPrincipal, repositorioJogador );
					frameTelaMenuPrincipal.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Somente Usuario ADM pode deletar");
				}
				break;
			case "4": 
				
				
				telaIndentificaAlterarJogador.criarTelaIndentificaAlterarJogador(repositorioJogador.retornaListaJogadores(), frameTelaMenuPrincipal, repositorioJogador);
				frameTelaMenuPrincipal.setVisible(false);
				break;
		
		
		}
	}
	
	//Para teste
	public void listarTeste(List<Jogador> listaJogadores){
		
		for(Jogador jogador: listaJogadores ){
			System.out.println(jogador.getNome());
			System.out.println(jogador.getCpf());
			
		}
		
	}

}
