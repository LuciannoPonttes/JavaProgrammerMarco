package gerenciadorArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Coordenador;


public class ManipulaArquivo {

	public void registrarCoordenador(Coordenador coordenador) {
		String enderecoArquivo = "C:\\Users\\Administrador\\Documents\\JavaProgrammerMarco\\JavaProgrammerMarco\\Aula-19-04-23\\coordenador.txt";
		
		try {
		
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			buWriter.append("O nome do coordenador é: " + coordenador.getNome());
			buWriter.newLine();
			buWriter.append("O cpf do coordenador é:" + coordenador.getCpf());
			buWriter.newLine();
			buWriter.append("A gerencia do coordenador é: " + coordenador.getCoordenacao());
			
			buWriter.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
