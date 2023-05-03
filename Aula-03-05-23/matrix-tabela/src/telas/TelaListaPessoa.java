package telas;

import java.awt.Frame;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlador.ControladorTelaListaPessoa;
import entidades.Pessoa;

public class TelaListaPessoa {

	public void listarPessoa(List<Pessoa> listaPessoas, JFrame frameMenuPrincipal ) {
		
		int quantidadeDeLinhas = listaPessoas.size();// Quantidade de linhas da tabela
		
		String [][] tabelaString = new String [quantidadeDeLinhas][2];
		
		int posicaoColuna = 0; //Representa a coluna
		int posicaoLinha = 0; // Representa a linha
		
		for (Pessoa pessoa: listaPessoas) {
			
			tabelaString[posicaoLinha][posicaoColuna] = pessoa.getNome();
			
			posicaoColuna++;// posicaoColuna =  posicaoColuna + 1
			
			tabelaString[posicaoLinha][posicaoColuna] = pessoa.getCpf();
			
			posicaoLinha++;// posicaoLinha = posicaoLinha + 1
			posicaoColuna = 0;
			
		}
		
		String nomesColunas[] = {"NOME", "CPF"}; // Lista com os nomes das colunas
		
		JFrame frameListarPessoa = new JFrame();
		frameListarPessoa.setSize(500, 600);
		
		JTable tabelaPessoa = new JTable(tabelaString, nomesColunas);// A tabela precisa receber os nomes dos titulos das colunas e matrix com as strings
		
		
		
		tabelaPessoa.setBounds(30, 40, 300, 300);// Dimensão(não se preocupar)

	    JScrollPane scrollPaneListarPessoa = new JScrollPane(tabelaPessoa);
	    
	    JPanel panelListarProgramador = new JPanel();
	    
	    panelListarProgramador.add(scrollPaneListarPessoa);
		
		JButton voltarTelaListarPessoa = new JButton("Voltar para o menu");
		panelListarProgramador.add(voltarTelaListarPessoa);
	    
		
		frameListarPessoa.add(panelListarProgramador);
		frameListarPessoa.setVisible(true);
		
		
		ControladorTelaListaPessoa controladorTelaListaPessoa = new ControladorTelaListaPessoa(frameMenuPrincipal, frameListarPessoa);
		voltarTelaListarPessoa.addActionListener(controladorTelaListaPessoa);
		
		
	}
	
}
