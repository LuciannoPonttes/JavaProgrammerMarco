package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import telas.TelaCadastroCoordenador;
import telas.TelaMenuCoordenador;

public class ControladorMenuCoordenador implements ActionListener {
	
	JTextField textRespostaRecebida;
	JFrame frameMenuCoordenadorRecebido;
	
	
	TelaCadastroCoordenador telaCadastroCoordenador = new TelaCadastroCoordenador();
	
	public ControladorMenuCoordenador(JTextField textRespostaRecebida, JFrame frameMenuCoordenador) {
		
		this.textRespostaRecebida = textRespostaRecebida;
		this.frameMenuCoordenadorRecebido = frameMenuCoordenador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String resposta = textRespostaRecebida.getText();
		
		if (resposta.equals("1") || resposta.equals("2") ) {
			
			switch (resposta) {
			case "1":
				telaCadastroCoordenador.criarTelaCadastroCoordenador();
				frameMenuCoordenadorRecebido.setVisible(false);
				break;
			case "2":
				System.out.println("Voltar");
				break;
			}
		}else {
		
			System.out.println("Invalido");
		
		}
		
	}

}
