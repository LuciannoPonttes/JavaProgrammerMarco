package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LogDao {
	
	
	public void registrarLog(String escritaLog) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();//Conexão
		
		String insertLogComando = "insert into tabela_log(escrita_log) values(?)"; // Comando sql que será executado
		
		Connection conexao = null;
		PreparedStatement declaracaoComando = null;
		
		try {
			conexao = fabricaConexao.criarConexao();// Busca a conexao
			
			declaracaoComando = (PreparedStatement)conexao.prepareStatement(insertLogComando); // Adicionar a conexão e o comando que será executado
			
			declaracaoComando.setString(1, escritaLog);
			
			declaracaoComando.execute();
		
		} catch (Exception e) {
			System.out.println("Erro ao registrar Log");
		
		}finally {
			try {// Para fechar as conexões 
				
				if(conexao != null) {
					conexao.close();
				}
				
				if(declaracaoComando != null) {
					declaracaoComando.close();
				}
				
				
			} catch (Exception e2) {
				System.out.println("Erro ao fechar a conexao");
			}
			
		}
		
		
		
		
		
	}

}
