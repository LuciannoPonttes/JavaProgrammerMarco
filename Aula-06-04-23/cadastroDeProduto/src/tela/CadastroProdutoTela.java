package tela;

import javax.swing.JOptionPane;

import entidades.Celular;
import entidades.Televisao;

public class CadastroProdutoTela {

	
	
	
	public Celular cadastrarCelular(Celular celularParametro) {
		
		celularParametro.setCodigo(JOptionPane.showInputDialog("Digite o codigo: "));
		celularParametro.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
		celularParametro.setSistemaOperacional(JOptionPane.showInputDialog("Digite o SO: "));
		
		return celularParametro;
		
	}
	
	public void mostrarCelular(Celular celularParametro) {
		
		JOptionPane.showMessageDialog(null, celularParametro.getCodigo());
		JOptionPane.showMessageDialog(null, celularParametro.getModelo());
		JOptionPane.showMessageDialog(null, celularParametro.getSistemaOperacional());
		
		
	}
	
	
	public Televisao cadastrarTelevisao(Televisao televisaoParametro) {
		
		televisaoParametro.setCodigo(JOptionPane.showInputDialog("Digite o codigo: "));
		televisaoParametro.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
		televisaoParametro.setQualidadeImagem(JOptionPane.showInputDialog("Digite a imagem: "));
		
		return televisaoParametro;
		
	}
	
	public void mostrarTelevisao(Televisao televisaoParametro) {
		
		JOptionPane.showMessageDialog(null, televisaoParametro.getCodigo());
		JOptionPane.showMessageDialog(null,televisaoParametro.getModelo());
		JOptionPane.showMessageDialog(null, televisaoParametro.getQualidadeImagem() );
		
		
	}
	
}
