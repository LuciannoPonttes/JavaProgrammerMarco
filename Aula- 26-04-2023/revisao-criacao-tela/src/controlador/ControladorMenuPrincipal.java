package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorMenuPrincipal implements ActionListener {

	JTextField textRespostaRecebida;
	
	
	public ControladorMenuPrincipal(JTextField textRespostaRecebida) {
		this.textRespostaRecebida = textRespostaRecebida;
	}
	
	


	@Override // Indica que o metedo é uma sobreEscrita
	public void actionPerformed(ActionEvent e) {
		switch (textRespostaRecebida.getText()) {
			case "1":
				JOptionPane.showMessageDialog(null, "Opção A");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "Opção B");
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "Opção C");
				break;
				
		}
		
		
	}

}
