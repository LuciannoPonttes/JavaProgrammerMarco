package principal;

import javax.swing.JOptionPane;

import entidades.Celular;
import entidades.Televisao;
import tela.CadastroProdutoTela;


public class Principal {

	public static void main(String[] args) {
		
		// Declara e inicializa o objeto do Tipo Celular que vai ser enviado para o metodo
		Celular celularEnviadoMetodo = new Celular();
		Televisao televisaoEnviadoMetodo = new Televisao();
		
		// Declara e inicializa o objeto do Tipo Celular que vai receber o resultado metodo
		Celular celularRecebidoMetodo = new Celular();
		Televisao televisaoRecebidoMetodo = new Televisao();
		
		//Declara e iniciliza o objeto CadastroProdutoTela
		CadastroProdutoTela caProdutoTela = new CadastroProdutoTela();
		
		
		//Cadastrar e mostrar o celular 
		celularRecebidoMetodo = caProdutoTela.cadastrarCelular(celularEnviadoMetodo);
		caProdutoTela.mostrarCelular(celularRecebidoMetodo);
		
		
		//Cadastrar e mostrar a televisao
		televisaoRecebidoMetodo = caProdutoTela.cadastrarTelevisao(televisaoEnviadoMetodo);
		caProdutoTela.mostrarTelevisao(televisaoRecebidoMetodo);
		

	}

}
