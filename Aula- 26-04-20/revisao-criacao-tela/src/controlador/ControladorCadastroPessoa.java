package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Pessoa;
import repositorio.PessoaRepositorio;



public class ControladorCadastroPessoa implements ActionListener {

	JTextField nomeRecebido;
	JTextField cpfRecebido;
	JFrame frameMenuPrincipalRecebido;
	JFrame frameCadastroPessoaRecebido;
	
	PessoaRepositorio pessoaRepositorioRecebido;
	
	

	public ControladorCadastroPessoa(JTextField nomeRecebido, JTextField cpfRecebido, JFrame frameMenuPrincipal,
			JFrame frameCadastroPessoa, PessoaRepositorio pessoaRepositorio) {
		this.nomeRecebido = nomeRecebido;
		this.cpfRecebido = cpfRecebido;
		this.frameMenuPrincipalRecebido = frameMenuPrincipal;
		this.frameCadastroPessoaRecebido = frameCadastroPessoa;
		this.pessoaRepositorioRecebido = pessoaRepositorio;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		pessoaRepositorioRecebido.salvar(popularPessoa());
		frameMenuPrincipalRecebido.setVisible(true);
		frameCadastroPessoaRecebido.setVisible(false);
	}
	
	public Pessoa popularPessoa() {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(nomeRecebido.getText());
		pessoa.setCpf(cpfRecebido.getText());
		
		return pessoa;
	}

}
