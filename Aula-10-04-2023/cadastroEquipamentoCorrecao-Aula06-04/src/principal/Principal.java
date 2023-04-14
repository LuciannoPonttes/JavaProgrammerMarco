package principal;


import java.time.LocalDate;

import telas.ParteGrafica;// Importando o objeto

public class Principal {

	
	public static void main(String[] args) {
		
		
		// Inicializei a classe ParteGrafica
		ParteGrafica paGrafica = new ParteGrafica();// Construtor Vazio
		//LocalDate inicio = new LocalDate();
		//int ano = inicio.getYear();
		//System.out.println(ano);
		
		//Chamar o metodo menu 
		paGrafica.menu();
		
	}
}
