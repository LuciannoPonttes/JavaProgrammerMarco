package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MenuInicialControle implements ActionListener {
	//Recebe da classe tela MenuInicial
		JTextField	opcaoMenuJTextField;
		JFrame  frameMenuInicial;
		

		public MenuInicialControle(JTextField opcaoMenuJTextField, JFrame frameMenuInicial) {
			//super();
			this.opcaoMenuJTextField = opcaoMenuJTextField;
			this.frameMenuInicial = frameMenuInicial;
		}
		
		
		//Ação do botão
		@Override
		public void actionPerformed(ActionEvent e) {
			if(opcaoMenuJTextField.getText().equals("1") || opcaoMenuJTextField.getText().equals("2") || opcaoMenuJTextField.getText().equals("3")){
				frameMenuInicial.setVisible(false);
			
				switch (opcaoMenuJTextField.getText()) {
					case "1":
						System.out.println("opcao 1 ");
					break;
					
					case "2":
						System.out.println("opcao 2");
					break;
					
					case "3":
						System.out.println("opcao 3 ");
						System.exit(0);
					break;
					
				}
					
			}else {
				
				JOptionPane.showMessageDialog(null, "Digite uma Opcão Valida!!!");
			}
			
					
			
		}
}
