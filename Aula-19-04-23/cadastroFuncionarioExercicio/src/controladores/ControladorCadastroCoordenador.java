package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidades.Coordenador;
import gerenciadorArquivo.ManipulaArquivo;

public class ControladorCadastroCoordenador implements ActionListener {
	
	JTextField textNomeRecebido;
	JTextField textCpfRecebido;
	JTextField textCoordenacaoRecebido;
	
	ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
	
	public ControladorCadastroCoordenador(JTextField textNomeRecebido, JTextField textCpfRecebido,
			JTextField textCoordenacaoRecebido) {
		this.textNomeRecebido = textNomeRecebido;
		this.textCpfRecebido = textCpfRecebido;
		this.textCoordenacaoRecebido = textCoordenacaoRecebido;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		manipulaArquivo.registrarCoordenador(popularCoordenador ());
		
	}
	
	
	
	public Coordenador popularCoordenador () {
		Coordenador coordenador = new Coordenador();
		
		coordenador.setNome(textNomeRecebido.getText());
		coordenador.setCpf(textCpfRecebido.getText());
		coordenador.setCoordenacao(textCoordenacaoRecebido.getText());
		
		return coordenador;
	}

}
