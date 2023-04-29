package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MenuInicialControle implements ActionListener {

	JTextField textMenuOpcaoLocal;
	
	//Construtor
	public MenuInicialControle(JTextField textMenuOpcao) {
		this.textMenuOpcaoLocal = textMenuOpcao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Você digitou a opcao: " + textMenuOpcaoLocal.getText());
	}

}
