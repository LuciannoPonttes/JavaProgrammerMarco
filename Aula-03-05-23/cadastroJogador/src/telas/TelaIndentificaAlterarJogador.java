package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.ControladordentificaAlterarJogador;
import entidades.Jogador;
import repositorio.RepositorioJogador;

public class TelaIndentificaAlterarJogador {

	public void criarTelaIndentificaAlterarJogador(List<Jogador> listaJogadores, JFrame menuPrincipal, RepositorioJogador repositorioJogador) {
		
int quantidadeDeLinhas = listaJogadores.size();// Quantidade de linhas da tabela
		
		String [][] tabelaString = new String [quantidadeDeLinhas][2];
		
		int posicaoColuna = 0; //Representa a coluna
		int posicaoLinha = 0; // Representa a linha
		
		for (Jogador jogador: listaJogadores) {
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getCpf();
			
			posicaoColuna++;// posicaoColuna =  posicaoColuna + 1
			
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getNome();
			
			posicaoLinha++;// posicaoLinha = posicaoLinha + 1
			posicaoColuna = 0;
			
		}
		
		String nomesColunas[] = {"CPF", "NOME"};
		
		JFrame frameAlterarJogador = new JFrame();
		frameAlterarJogador.setSize(500, 600);
		
		JTable tabelaJogador = new JTable(tabelaString, nomesColunas);// A tabela precisa receber os nomes dos titulos das colunas e matrix com as strings
		
		
		
		tabelaJogador.setBounds(30, 40, 300, 300);// Dimensão(não se preocupar)

	    JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaJogador);
	    
	    JPanel panelListarProgramador = new JPanel();
	    
	    JLabel labelCpf = new JLabel("Digite o cpf para alterar:");
	    panelListarProgramador.add(labelCpf);
	    
	    
	    JTextField textCpfDelete = new JTextField(10);
	    panelListarProgramador.add(textCpfDelete);
	    
	    panelListarProgramador.add(scrollPaneListarJogador);
		
	    JButton alterarTelaAlterarJogador = new JButton("Alterar");
		panelListarProgramador.add(alterarTelaAlterarJogador);
		
		JButton voltarTelaDeletarJogador = new JButton("Voltar");
		panelListarProgramador.add(voltarTelaDeletarJogador);
	    
		
		frameAlterarJogador.add(panelListarProgramador);
		frameAlterarJogador.setVisible(true);
		
		ControladordentificaAlterarJogador alterarJogador = new ControladordentificaAlterarJogador(menuPrincipal, frameAlterarJogador, repositorioJogador, textCpfDelete);
		
		alterarTelaAlterarJogador.addActionListener(alterarJogador);
		voltarTelaDeletarJogador.addActionListener(alterarJogador);
		
	}
	
}
