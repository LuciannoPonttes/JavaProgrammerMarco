package telas;

import javax.swing.JOptionPane;

import entidades.Furadeira;
import entidades.Makita;
import servico.Calculos;

public class ParteGrafica {
	Calculos calc = new Calculos();
	
	
	public void cadastrarFuradeira(Furadeira furadeira) {
		
		
		
		// Recebe os dados do usuario e armazena nos atributos do objeto
		furadeira.setCodigo(JOptionPane.showInputDialog("Digite o codigo: "));
		furadeira.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
		furadeira.setTipoBroca(JOptionPane.showInputDialog("Digite o tipo de broca: "));
		furadeira.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco de compra: ")));
		furadeira.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco de venda: ")));
		
		//Chama o metodo calcular lucro
		furadeira.setLucro(calc.calcularLucro(furadeira.getPrecoDeVenda(), furadeira.getPrecoDeCompra()));
		
		apresentarFuradeira(furadeira);
		
		
		
	}
	
	public void apresentarFuradeira(Furadeira furadeiraParametro) {
		JOptionPane.showMessageDialog(null, "O codigo da furadeira é: " + furadeiraParametro.getCodigo());
		JOptionPane.showMessageDialog(null, "A marca da furadeira é: " + furadeiraParametro.getMarca());
		JOptionPane.showMessageDialog(null, "A broca da furadeira é: " + furadeiraParametro.getTipoBroca());
		JOptionPane.showMessageDialog(null, "O preço de Compra da furadeira é: " + furadeiraParametro.getPrecoDeCompra());
		JOptionPane.showMessageDialog(null, "O preço de Venda da furadeira é: " + furadeiraParametro.getPrecoDeVenda());
		JOptionPane.showMessageDialog(null, "O lucro da furadeira é: " + furadeiraParametro.getLucro());
	}
	
	public Makita cadastrarMakita() {
		Makita makita = new Makita();
		
		// Recebe os dados do usuario e armazena nos atributos do objeto
		makita.setCodigo(JOptionPane.showInputDialog("Digite o codigo: "));
		makita.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
		makita.setTipoDisco(JOptionPane.showInputDialog("Digite o tipo de disco: "));
		makita.setPrecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco de compra: ")));
		makita.setPrecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco de venda: ")));
		
		//Chama o metodo calcular lucro
		makita.setLucro(calc.calcularLucro(makita.getPrecoDeVenda(), makita.getPrecoDeCompra()));
		
		return makita;
		
	}
	
	public void apresentarMakita(Makita makitaParametro) {
		JOptionPane.showMessageDialog(null, "O codigo da Makita é: " + makitaParametro.getCodigo());
		JOptionPane.showMessageDialog(null, "A marca da Makita é: " + makitaParametro.getMarca());
		JOptionPane.showMessageDialog(null, "A broca da Makita é: " + makitaParametro.getTipoDisco());
		JOptionPane.showMessageDialog(null, "O preço de Compra da Makita é: " + makitaParametro.getPrecoDeCompra());
		JOptionPane.showMessageDialog(null, "O preço de Venda da Makita é: " + makitaParametro.getPrecoDeVenda());
		JOptionPane.showMessageDialog(null, "O lucro da Makita é: " + makitaParametro.getLucro());
	}
	
	public void menu() {
		int opcao;
		
		Furadeira furadeira = new Furadeira();
		Boolean sair = true;
		
		
	// Estrutura do while
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Furadeira  -  2 para Makita - 3  Para sair "));
			
			if(!(opcao != 1 || opcao != 2 || opcao != 3)) {
				if(opcao == 1) {
					 cadastrarFuradeira(furadeira);
					
				}
				
				if(opcao == 2) {
					apresentarMakita(cadastrarMakita());
				}
				
				if(opcao == 3) {
					sair = false;
					System.exit(0);// Encerrar o sistema
				}
			
			}else {
				JOptionPane.showMessageDialog(null, "Invalido!!!!");
					
			}
		
		}while(sair);
		
		
		
		
		/*
		while (sair) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Furadeira  -  2 para Makita - 3  Para sair "));
			
			if(opcao == 1) {
				 cadastrarFuradeira(furadeira);
				
			}
			
			if(opcao == 2) {
				apresentarMakita(cadastrarMakita());
			}
			
			if(opcao == 3) {
				sair = false;
				System.exit(0);// Encerrar o sistema
			}
			
			
		}
		*/
			
		
		
		
		
		
		
		
		
	
	}
	
	
	
}
