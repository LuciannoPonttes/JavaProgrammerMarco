package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControladorTelaListarJogador implements ActionListener {
	
	JFrame frameMenuJogadorRecebido;
	JFrame frameTelaListaJogador;
	
	
	
	
	public ControladorTelaListarJogador(JFrame frameMenuJogadorRecebido, JFrame frameTelaListaJogador) {
		
		this.frameMenuJogadorRecebido = frameMenuJogadorRecebido;
		this.frameTelaListaJogador = frameTelaListaJogador;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		 frameMenuJogadorRecebido.setVisible(true);
		 frameTelaListaJogador.setVisible(false);
		
	}

}
