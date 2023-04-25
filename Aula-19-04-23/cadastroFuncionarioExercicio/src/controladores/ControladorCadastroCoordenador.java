package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Coordenador;
import gerenciadorArquivo.ManipulaArquivo;
import repositorio.RepositorioCoordenador;

public class ControladorCadastroCoordenador implements ActionListener {
	
	JTextField textNomeRecebido;
	JTextField textCpfRecebido;
	JTextField textCoordenacaoRecebido;
	
	RepositorioCoordenador repositorioCoordenador = new RepositorioCoordenador();
	
	ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
	
	Boolean respostaSalvamento;
	
	public ControladorCadastroCoordenador(JTextField textNomeRecebido, JTextField textCpfRecebido,
			JTextField textCoordenacaoRecebido) {
		this.textNomeRecebido = textNomeRecebido;
		this.textCpfRecebido = textCpfRecebido;
		this.textCoordenacaoRecebido = textCoordenacaoRecebido;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		respostaSalvamento = repositorioCoordenador.salvarCoordenador(popularCoordenador ());
		
		if (respostaSalvamento) {
			JOptionPane.showMessageDialog(null, "O registro foi salvo com Sucesso!!");
		}else {
			JOptionPane.showMessageDialog(null, "Erro ao registrar!!");
		}
	}
	
	
	
	public Coordenador popularCoordenador () {
		Coordenador coordenador = new Coordenador();
		
		coordenador.setNome(textNomeRecebido.getText());
		coordenador.setCpf(textCpfRecebido.getText());
		coordenador.setCoordenacao(textCoordenacaoRecebido.getText());
		
		return coordenador;
	}

}
