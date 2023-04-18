package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroGerente {

	public void telaCadastrarGerente() {
		
		
		String nomeGerente = "Digite o nome do Gerente:";
		String cpf = "Digite o cpf do Gerente:";
		String gerenciaGerente = "Digite a gerencia do Gerente:";
		
		
		JFrame frameCadastroGerente = new JFrame();
		frameCadastroGerente.setSize(330,300);
		
		JPanel panelCadastroGerente = new JPanel();
		
		
		JLabel labelNomeGerente = new JLabel(nomeGerente);
		panelCadastroGerente.add(labelNomeGerente);
		
		JTextField textNomeGerente = new JTextField(10);
		panelCadastroGerente.add(textNomeGerente);
		
		JLabel labelcpfGerente = new JLabel(cpf);
		panelCadastroGerente.add(labelcpfGerente);
		
		JTextField textCpfGerente = new JTextField(10);
		panelCadastroGerente.add(textCpfGerente);
		
		JLabel labelgerenciaGerente = new JLabel(gerenciaGerente);
		panelCadastroGerente.add(labelgerenciaGerente);
		
		JTextField textGerenciaGerente = new JTextField(10);
		panelCadastroGerente.add(textGerenciaGerente);
		
		JButton botaoEnviar = new JButton("Enviar");//Cria o botão
		panelCadastroGerente.add(botaoEnviar);//Adiciona o botão no painel
		
		
		ControladorTelaCadastroGerente controladorCadastroGerente = new ControladorTelaCadastroGerente(textNomeGerente, textCpfGerente, textGerenciaGerente);
		botaoEnviar.addActionListener(controladorCadastroGerente);
		
		
		frameCadastroGerente.add(panelCadastroGerente);
		frameCadastroGerente.setVisible(true);
		
	}
	
}
