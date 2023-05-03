package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Pessoa;
import repositorio.PessoaRepositorio;
import telas.TelaCadastroPessoa;
import telas.TelaListaPessoa;

public class ControladorMenuPrincipal implements ActionListener {

	JTextField textRespostaRecebida;
	JFrame frameMenuPrincipal;
	
	
	public ControladorMenuPrincipal(JTextField textRespostaRecebida, JFrame frameMenuPrincipal) {
		super();
		this.textRespostaRecebida = textRespostaRecebida;
		this.frameMenuPrincipal = frameMenuPrincipal;
	}



	TelaCadastroPessoa telaCadastroPessoa = new TelaCadastroPessoa();
	TelaListaPessoa telaListaPessoa = new TelaListaPessoa();
	
	PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
	

	@Override // Indica que o metedo é uma sobreEscrita
	public void actionPerformed(ActionEvent e) {
		
		switch (textRespostaRecebida.getText()) {
			case "1":
				telaCadastroPessoa.cadastrarPessoa(frameMenuPrincipal, pessoaRepositorio);
				frameMenuPrincipal.setVisible(false);
				break;
			case "2":
				telaListaPessoa.listarPessoa(pessoaRepositorio.retonarListaPessoas(), frameMenuPrincipal);
				frameMenuPrincipal.setVisible(false);
				
				//imprimirPessoas(pessoaRepositorio.retonarListaPessoas());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "Opção C");
				break;
				
		}
		
		
	}
	
	public void imprimirPessoas(List<Pessoa> pessoasLista) {
		for (Pessoa pessoaItem:pessoasLista ) {
			System.out.println(pessoaItem.getNome());
			System.out.println(pessoaItem.getCpf());
			System.out.println("#######################");
			
		}
		
	}

}
