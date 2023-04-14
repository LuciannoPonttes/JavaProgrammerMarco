package arquivoGerente;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Aluno;

public class RegistrarArquivo {

	public void registrarAluno(Aluno al) {
		String enderecoArquivo = "C:\\Users\\Administrador\\Documents\\JavaProgrammerMarco\\JavaProgrammerMarco\\Aula-14-04-2023\\aluno.txt";
		
		try {
		
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			
			
			buWriter.append(al.getMatricula());
			buWriter.newLine();
			buWriter.append(al.getNome());
			buWriter.newLine();
			buWriter.append(al.getTurma());
			
			buWriter.close();
			
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
}
