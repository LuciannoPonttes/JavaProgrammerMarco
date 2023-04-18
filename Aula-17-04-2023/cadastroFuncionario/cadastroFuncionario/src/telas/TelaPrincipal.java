package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPrincipal {

	
	public void menuPrincipal() {
		
		String opcao1 = "Digite 1 para Gerente";
		String opcao2 = "Digite 2 para Coordenador";
		String opcao3 = "Digite 3 para Atendente";
		
		//Criar o JFrame
		JFrame frameMenuPrincipal = new JFrame();//Criar o frame
		frameMenuPrincipal.setSize(200,200);//Parametro de altura e largura
		frameMenuPrincipal.setTitle("Menu Principal"); // Titulo da tela
		
		JPanel panelMenuPrincipal = new JPanel();//Criação do painel
		
		JLabel labelOpcao1 = new JLabel(opcao1); // Cria a label da opcao 1
		panelMenuPrincipal.add(labelOpcao1);//Adiciona a labelOpcao1 no panelMenuPrincipal
		
		JLabel labelOpcao2 = new JLabel(opcao2); // Cria a label da opcao 2
		panelMenuPrincipal.add(labelOpcao2);//Adiciona a labelOpcao2 no panelMenuPrincipal
		
		JLabel labelOpcao3 = new JLabel(opcao3); // Cria a label da opcao 
		panelMenuPrincipal.add(labelOpcao3);//Adiciona a labelOpcao3 no panelMenuPrincipal
		
		JTextField textResposta = new JTextField(10);//Criando Caixa de texto para receber a resposta
		panelMenuPrincipal.add(textResposta);// Adicionando textResposta no panelMenuPrincipal
		
		JButton botaoEnviar = new JButton("Enviar");//Cria o botão
		panelMenuPrincipal.add(botaoEnviar);//Adiciona o botão no painel
		
		frameMenuPrincipal.add(panelMenuPrincipal);// Adiciona o panelMenuPrincipal no frameMenuPrincipal
		frameMenuPrincipal.setVisible(true);// Mostrar o Frame
		
		ControladorTelaPrincipal controladorTelaPrincipal = new ControladorTelaPrincipal(textResposta,frameMenuPrincipal);// Inicialiazação a classe de controlle
		botaoEnviar.addActionListener(controladorTelaPrincipal);// Indicando qual é o action do botão
	
	
	}
	
}
