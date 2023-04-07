package tela;

import javax.swing.JOptionPane;

import entidades.Celular;
import entidades.Televisao;

public class CadastroProdutoTela {

	
	
	
	public Celular cadastrarCelular(Celular celularParametro) {
		
		celularParametro.setCodigo("123");
		celularParametro.setModelo("Redmi");
		celularParametro.setSistemaOperacional("Android");
		
		return celularParametro;
		
	}
	
	public void mostrarCelular(Celular celularParametro) {
		
		JOptionPane.showMessageDialog(null, celularParametro.getCodigo());
		JOptionPane.showMessageDialog(null, celularParametro.getModelo());
		JOptionPane.showMessageDialog(null, celularParametro.getSistemaOperacional());
		
		
	}
	
	
	public Televisao cadastrarTelevisao(Televisao televisaoParametro) {
		
		televisaoParametro.setCodigo("124");
		televisaoParametro.setModelo("Sony");
		televisaoParametro.setQualidadeImagem("1920 X 1080");
		
		return televisaoParametro;
		
	}
	
	public void mostrarTelevisao(Televisao televisaoParametro) {
		
		JOptionPane.showMessageDialog(null, televisaoParametro.getCodigo());
		JOptionPane.showMessageDialog(null,televisaoParametro.getModelo());
		JOptionPane.showMessageDialog(null, televisaoParametro.getQualidadeImagem() );
		
		
	}
	
}
