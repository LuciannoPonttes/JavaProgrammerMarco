package gerenciaArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Gerente;

public class ManipulaArquivo {

	public void registrarGerente(Gerente gerente) {
		String enderecoArquivo = "C:\\Users\\Administrador\\Documents\\JavaProgrammerMarco\\JavaProgrammerMarco\\Aula-17-04-2023\\cadastroFuncionario\\gerente.txt";
		
		try {
		
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			buWriter.append("O nome do gerente é: " + gerente.getNome());
			buWriter.newLine();
			buWriter.append("O cpf do gerente é:" + gerente.getCpf());
			buWriter.newLine();
			buWriter.append("A gerencia do gerente é: " + gerente.getGerencia());
			
			buWriter.close();
			
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
