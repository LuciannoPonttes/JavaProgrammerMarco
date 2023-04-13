package servicoArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulaArquivo {
public static void escreverNoArquivo(String enderecoArquivo) {
		
		
		try {
			String escrita = "Rodrigo Santana";
			
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			buWriter.newLine(); 
			buWriter.append(escrita + "\n");
			buWriter.append(escrita + "\n");// Abre o acesso ao aquivo e escreve no mesmo;
			buWriter.close();
			System.out.println("deu bom");
			
			
			
		}catch (IOException mensagemErro) {
			System.out.println("Deu ruim:  " + mensagemErro);
		
		}
	
	}
		
}
