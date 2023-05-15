package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlador.ControladorTelaListarJogador;
import entidades.Jogador;


public class TelaListarJogador {

	public void listarJogador(List<Jogador> listaJogadores, JFrame menuPrincipal) {
		
		int quantidadeDeLinhas = listaJogadores.size();// Quantidade de linhas da tabela
		
		String [][] tabelaString = new String [quantidadeDeLinhas][3];
		
		int posicaoColuna = 0; //Representa a coluna
		int posicaoLinha = 0; // Representa a linha
		
		for (Jogador jogador: listaJogadores) {
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getCpf();
			
			posicaoColuna++;// posicaoColuna =  posicaoColuna + 1
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getNome();
			
			posicaoColuna++;// posicaoColuna =  posicaoColuna + 1
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getEmail();
			
			posicaoColuna++;// posicaoColuna =  posicaoColuna + 1
			
			posicaoLinha++;// posicaoLinha = posicaoLinha + 1
			posicaoColuna = 0;
			
		}
		
		String nomesColunas[] = {"CPF", "NOME", "EMAIL"};
		
		JFrame frameListarJogador = new JFrame();
		frameListarJogador.setSize(500, 600);
		
		JTable tabelaJogador = new JTable(tabelaString, nomesColunas);// A tabela precisa receber os nomes dos titulos das colunas e matrix com as strings
		
		
		
		tabelaJogador.setBounds(30, 40, 300, 300);// Dimensão(não se preocupar)

	    JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaJogador);
	    
	    JPanel panelListarProgramador = new JPanel();
	    
	    panelListarProgramador.add(scrollPaneListarJogador);
		
		JButton voltarTelaListarJogador = new JButton("Voltar para o menu");
		panelListarProgramador.add(voltarTelaListarJogador);
	    
		
		frameListarJogador.add(panelListarProgramador);
		frameListarJogador.setVisible(true);
		
		ControladorTelaListarJogador controladorTelaListarJogador = new ControladorTelaListarJogador(menuPrincipal, frameListarJogador);
		voltarTelaListarJogador.addActionListener(controladorTelaListarJogador);
		
		
	}
	
	
}
