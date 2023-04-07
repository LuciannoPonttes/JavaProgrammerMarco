package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Animal;

public class Principal {
	
	public static void main(String[] args) {
		
		Animal animalclasse = new Animal();
		
		Scanner entradaDados = new Scanner(System.in);
		
		String recebeOnome;
		
		//System.out.println("Digite o nome do Animal:");
		recebeOnome =  JOptionPane.showInputDialog("Digite o nome");
		
		//Armazena a String recebeOnome na variavel nome da classe Animal
		animalclasse.setNome(recebeOnome);
		
		
		System.out.println(animalclasse.getNome());
		JOptionPane.showMessageDialog(null,animalclasse.getNome());
		
		
	} 
}
