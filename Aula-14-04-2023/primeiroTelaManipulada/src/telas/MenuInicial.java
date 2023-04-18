package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuInicial{

	public void menu() {
		
		String opcao1 = "Digite 1 para a opcao 1: ";
		String opcao2 = "Digite 2 para a opcao 2: ";
		
		
		
		JFrame frameMenu = new JFrame();
		frameMenu.setSize(200, 200);
		
		
		JPanel panelMenu = new JPanel();
		
		JLabel labelOpcao1 = new JLabel(opcao1);
		panelMenu.add(labelOpcao1);
		
		JLabel labelOpcao2 = new JLabel(opcao2);
		panelMenu.add(labelOpcao2);
		
		JTextField textMenuOpcao = new JTextField(10);
		panelMenu.add(textMenuOpcao);
		
		JButton buttonMenu = new JButton("Enviar");
		panelMenu.add(buttonMenu);
		
		
		frameMenu.add(panelMenu);
		frameMenu.setVisible(true);
		
		
		MenuInicialControle menuInicialControle = new MenuInicialControle(textMenuOpcao);
		buttonMenu.addActionListener(menuInicialControle);
	}
	
	
}
