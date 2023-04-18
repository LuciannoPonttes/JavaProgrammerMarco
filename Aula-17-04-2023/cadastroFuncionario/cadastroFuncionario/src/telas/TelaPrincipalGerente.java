package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPrincipalGerente {

	public void menuGerente() {
		
		String opcao1 = "Digite 1 para Cadastrar Ger";
		String opcao2 = "Digite 2 para Visualizar Ger";
		
		JFrame frameMenuPrincipalGerente = new JFrame();//Criar o frame
		frameMenuPrincipalGerente.setSize(200,200);//Parametro de altura e largura
		frameMenuPrincipalGerente.setTitle("Menu Principal"); // Titulo da tela
		
		JPanel panelMenuPrincipalGerente = new JPanel();//Criação do painel
		
		JLabel labelOpcao1 = new JLabel(opcao1); // Cria a label da opcao 1
		panelMenuPrincipalGerente.add(labelOpcao1);//Adiciona a labelOpcao1 no panelMenuPrincipal
		
		JLabel labelOpcao2 = new JLabel(opcao2); // Cria a label da opcao 2
		panelMenuPrincipalGerente.add(labelOpcao2);//Adiciona a labelOpcao2 no panelMenuPrincipal
		
		JTextField textResposta = new JTextField(10);//Criando Caixa de texto para receber a resposta
		panelMenuPrincipalGerente.add(textResposta);// Adicionando textResposta no panelMenuPrincipal
		
		JButton botaoEnviar = new JButton("Enviar");//Cria o botão
		panelMenuPrincipalGerente.add(botaoEnviar);//Adiciona o botão no painel
		
		frameMenuPrincipalGerente.add(panelMenuPrincipalGerente);// Adiciona o panelMenuPrincipal no frameMenuPrincipal
		frameMenuPrincipalGerente.setVisible(true);// Mostrar o Frame
		
		ControladorTelaPrincipalGerente controladorTelaPrincipalGerente = new ControladorTelaPrincipalGerente(textResposta, frameMenuPrincipalGerente); // Inicialiazação a classe de controlle
		botaoEnviar.addActionListener(controladorTelaPrincipalGerente);// Indicando qual é o action do botão
		
		
		
	}
}
