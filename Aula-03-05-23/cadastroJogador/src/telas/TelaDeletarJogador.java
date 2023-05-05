package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.ControladorTelaDeletarJogador;
import entidades.Jogador;
import repositorio.RepositorioJogador;

public class TelaDeletarJogador {

	public void deletarJogador(List<Jogador> listaJogadores, JFrame menuPrincipal, RepositorioJogador repositorioJogador) {
		
		
		int quantidadeDeLinhas = listaJogadores.size();// Quantidade de linhas da tabela
		
		String [][] tabelaString = new String [quantidadeDeLinhas][2];
		
		int posicaoColuna = 0; //Representa a coluna
		int posicaoLinha = 0; // Representa a linha
		
		for (Jogador jogador: listaJogadores) {
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getNome();
			
			posicaoColuna++;// posicaoColuna =  posicaoColuna + 1
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getCpf();
			
			posicaoLinha++;// posicaoLinha = posicaoLinha + 1
			posicaoColuna = 0;
			
		}
		
		String nomesColunas[] = {"NOME", "CPF"};
		
		JFrame frameDeletarJogador = new JFrame();
		frameDeletarJogador.setSize(500, 600);
		
		JTable tabelaJogador = new JTable(tabelaString, nomesColunas);// A tabela precisa receber os nomes dos titulos das colunas e matrix com as strings
		
		
		
		tabelaJogador.setBounds(30, 40, 300, 300);// Dimensão(não se preocupar)

	    JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaJogador);
	    
	    JPanel panelListarProgramador = new JPanel();
	    
	    JLabel labelCpf = new JLabel("Digite o cpf para deletar:");
	    panelListarProgramador.add(labelCpf);
	    
	    
	    JTextField textCpfDelete = new JTextField(10);
	    panelListarProgramador.add(textCpfDelete);
	    
	    panelListarProgramador.add(scrollPaneListarJogador);
		
	    JButton deletarTelaDeletarJogador = new JButton("Deletar");
		panelListarProgramador.add(deletarTelaDeletarJogador);
		
		JButton voltarTelaDeletarJogador = new JButton("Voltar");
		panelListarProgramador.add(voltarTelaDeletarJogador);
	    
		
		frameDeletarJogador.add(panelListarProgramador);
		frameDeletarJogador.setVisible(true);
		
		ControladorTelaDeletarJogador controladorTelaDeletarJogador = new ControladorTelaDeletarJogador(menuPrincipal, frameDeletarJogador, repositorioJogador, textCpfDelete);
		
		//Botoes
		deletarTelaDeletarJogador.addActionListener(controladorTelaDeletarJogador);
		voltarTelaDeletarJogador.addActionListener(controladorTelaDeletarJogador);
	}
	
	
}
