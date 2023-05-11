package principal;

import java.sql.Connection;

import javax.swing.JOptionPane;

import persistencia.FabricaConexao;
import telas.TelaMenuJogador;

public class Principal {

	public static void main(String args[]) {
		
		TelaMenuJogador telaMenuJogador = new TelaMenuJogador();
		telaMenuJogador.criarTelaMenuJogador();
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Usado apenas para testar a conexão
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		Connection conexaoRecebida = fabricaConexao.criarConexao();
		
		
		if(conexaoRecebida != null) {
			JOptionPane.showMessageDialog(null, "Deu certo");
			
		}
		
		if(conexaoRecebida == null) {
			JOptionPane.showMessageDialog(null, "Deu ruim a conexao");
			
		}
		*/
		
		
		
	}
}
