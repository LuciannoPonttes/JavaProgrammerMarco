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
	JFrame  frameMenuPrincipalRecebido;
	
	TelaCadastroCoordenador telaCadastroCoordenador = new TelaCadastroCoordenador();
	
	public ControladorMenuCoordenador(JTextField textRespostaRecebida, JFrame frameMenuCoordenador,
			JFrame frameMenuPrincipal) {
		
		this.textRespostaRecebida = textRespostaRecebida;
		this.frameMenuCoordenadorRecebido = frameMenuCoordenador;
		this. frameMenuPrincipalRecebido = frameMenuPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String resposta = textRespostaRecebida.getText();
		
		if (resposta.equals("1") || resposta.equals("2")||
				resposta.equals("3")|| resposta.equals("4")||resposta.equals("5")) {
			
			switch (resposta) {
			case "1":
				telaCadastroCoordenador.criarTelaCadastroCoordenador();
				frameMenuCoordenadorRecebido.setVisible(false);
				break;
			case "2":
				System.out.println("Listar Coordenador");
				break;
			case "3":
				System.out.println("Deletar Coordenador");
				break;
			case "4":
				System.out.println("Editar Coordenador");
				break;
			case "5":
				frameMenuPrincipalRecebido.setVisible(true);
				frameMenuCoordenadorRecebido.setVisible(false);
				break;
			}
		}else {
		
			System.out.println("Invalido");
		
		}
		
	}

}
