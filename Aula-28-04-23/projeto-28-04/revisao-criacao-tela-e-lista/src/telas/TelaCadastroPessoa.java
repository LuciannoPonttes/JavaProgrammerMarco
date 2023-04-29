package telas;

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
		
		String nome = "Digite o nome:";
		String cpf = "Digite o cpf:";
	
		JFrame frameCadastroPessoa = new JFrame();
		frameCadastroPessoa.setSize(200,200);
		
		JPanel panelCadastroPessoa = new JPanel();
		
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
