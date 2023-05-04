package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorCadastroPessoa;
import entidades.Pessoa;
import repositorio.PessoaRepositorio;

public class TelaCadastroPessoa {

	
	public void cadastrarPessoa(JFrame frameMenuPrincipal, PessoaRepositorio pessoaRepositorio) {
		
		String nome = "  Digite o nome:";
		String cpf = "   Digite o cpf:";
	
		GridLayout grid = new GridLayout (0,1);
		
		JFrame frameCadastroPessoa = new JFrame();
		frameCadastroPessoa.setSize(400,250);
		
		JPanel panelCadastroPessoa = new JPanel();
		
		panelCadastroPessoa.setLayout(grid);
		
		JLabel labelNome = new JLabel(nome);
		panelCadastroPessoa.add(labelNome);
		
		JTextField textNome = new JTextField(10);
		panelCadastroPessoa.add(textNome);
		
		JLabel labelCpf = new JLabel(cpf);
		panelCadastroPessoa.add(labelCpf);
		
		JTextField textCpf = new JTextField(10);
		panelCadastroPessoa.add(textCpf);
		
		
		JButton enviarCadastroPessoa = new JButton("Enviar");
		panelCadastroPessoa.add(enviarCadastroPessoa);
		
		frameCadastroPessoa.add(panelCadastroPessoa);
		frameCadastroPessoa.setVisible(true);
		
		
		
		ControladorCadastroPessoa controladorCadastroPessoa = new ControladorCadastroPessoa(textNome, textCpf, frameMenuPrincipal, frameCadastroPessoa, pessoaRepositorio);
		enviarCadastroPessoa.addActionListener(controladorCadastroPessoa);
		
	}
}
