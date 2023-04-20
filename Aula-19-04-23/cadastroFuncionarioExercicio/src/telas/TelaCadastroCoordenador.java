package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorCadastroCoordenador;

public class TelaCadastroCoordenador {

	public void criarTelaCadastroCoordenador() {
		
		String nomeCoordenador = "Digite o nome do Coordenador:";
		String cpf = "Digite o cpf do Coordenador:";
		String coordenacaoCoordenado = "Digite a gerencia do Coordenador:";
		
		
		JFrame frameCadastroCoordenador = new JFrame();
		frameCadastroCoordenador.setSize(330,300);
		
		JPanel panelCadastroCoordenador = new JPanel();
		
		
		JLabel labelNomeCoordenador = new JLabel(nomeCoordenador);
		panelCadastroCoordenador.add(labelNomeCoordenador);
		
		JTextField textNomeCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textNomeCoordenador);
		
		JLabel labelcpfCoordenador = new JLabel(cpf);
		panelCadastroCoordenador.add(labelcpfCoordenador);
		
		JTextField textCpfCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textCpfCoordenador);
		
		JLabel labelCoordenador = new JLabel(coordenacaoCoordenado);
		panelCadastroCoordenador.add(labelCoordenador);
		
		JTextField textCoordenador = new JTextField(10);
		panelCadastroCoordenador.add(textCoordenador);
		
		JButton botaoEnviar = new JButton("Enviar");//Cria o botão
		panelCadastroCoordenador.add(botaoEnviar);//Adiciona o botão no painel
		
		frameCadastroCoordenador.add(panelCadastroCoordenador);
		frameCadastroCoordenador.setVisible(true);
		
		ControladorCadastroCoordenador cadastroCoordenador = new ControladorCadastroCoordenador(textNomeCoordenador, textCpfCoordenador, textCoordenador);
		botaoEnviar.addActionListener(cadastroCoordenador);
		
		
		
		
	}
	
}
