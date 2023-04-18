package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidades.Gerente;
import gerenciaArquivo.ManipulaArquivo;

public class ControladorTelaCadastroGerente implements ActionListener {

	JTextField textNomeGerenteRecebido;
	JTextField textcpfGerenteRecebido;
	JTextField textGerenciaGerenteRecebido;
	
	
	
	ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
	
	

	public ControladorTelaCadastroGerente(JTextField textNomeGerente, JTextField textCpfGerente,
			JTextField textGerenciaGerente) {
		this.textNomeGerenteRecebido = textNomeGerente;
		this.textcpfGerenteRecebido = textCpfGerente;
		this.textGerenciaGerenteRecebido = textGerenciaGerente;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		manipulaArquivo.registrarGerente(popularGerente());
		
	
	}
	
	
	public Gerente popularGerente() {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome(textNomeGerenteRecebido.getText());
		gerente.setCpf(textcpfGerenteRecebido.getText());
		gerente.setGerencia(textGerenciaGerenteRecebido.getText());
		
		return gerente;
		
	}

}
