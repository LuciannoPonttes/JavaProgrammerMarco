package principal;

import servicoArquivo.ManipulaArquivo;

public class Principal {
	

		public static void main(String[] args) {
			String path = "C:\\Users\\Administrador\\Documents\\JavaProgrammerMarco\\JavaProgrammerMarco\\Aula-28-03-23\\MeuPrimeiroApp\\aula-12-04.txt";
		
		
			ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
			manipulaArquivo.escreverNoArquivo(path);
		
		
		
		}
}
