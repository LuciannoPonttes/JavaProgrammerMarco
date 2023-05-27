package manipulacaoArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entidades.Jogador;
import persistencia.LogDao;

public class LogCrudJogador {

	
	
	public void escreverNoArquivoLogJogador(Jogador jogador, String tipoOperacao) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LogDao logDao = new LogDao();
		LocalDateTime horaAtual =  LocalDateTime.now();
		
		String enderecoArquivo = "D:\\RepositorioGit\\JavaProgrammerMarco\\Aula-03-05-23\\cadastroJogador\\log\\logJogador.txt";
		String escrita = "";
		switch (tipoOperacao) {
		
		case  "Deletar":
			escrita = horaAtual.format(formatter) + "O jogador(a) " + jogador.getNome() + " com Cpf: "+ jogador.getCpf() + "foi excluido!";
			break;
		case  "Alterar":
			escrita = horaAtual.format(formatter) + " - O jogador(a) " + jogador.getNome() + " com Cpf: "+ jogador.getCpf() + " foi alterado!";
			break;
		case  "Cadastrar":
			escrita = horaAtual.format(formatter) + " - O jogador(a) " + jogador.getNome() + " com Cpf: "+ jogador.getCpf() + " foi cadastrado!" ;
			break;
		
		}
		try {
			
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo, true));

			buWriter.append(escrita + "\n"); // Abre o acesso ao aquivo e escreve no mesmo;
			buWriter.close();
			
			System.out.println("deu bom");
			
			logDao.registrarLog(escrita);
			
		}catch (IOException mensagemErro) {
			System.out.println("Deu ruim:  " + mensagemErro);

		}








	}
	
	
	
	
}
