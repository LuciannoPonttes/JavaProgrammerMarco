package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import entidades.Furadeira;

public class ManipulaArquivo {

	public void registrarFuradeira(Furadeira furadeira) {
		
		String endereco = "C:\\Users\\Administrador\\Documents\\JavaProgrammerMarco\\JavaProgrammerMarco\\Aula-28-03-23\\MeuPrimeiroApp\\registroConvidado.txt";
		
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(endereco));
			
			bufferedWriter.append(furadeira.getCodigo());
			bufferedWriter.newLine();
			bufferedWriter.append(furadeira.getMarca());
			bufferedWriter.newLine();
			bufferedWriter.append(furadeira.getTipoBroca());
			bufferedWriter.newLine();
			bufferedWriter.append(String.valueOf(furadeira.getLucro()));
			
			bufferedWriter.close();
			
			JOptionPane.showMessageDialog(null, "Registro Realizado");
		
		
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro no registro");
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
}
