package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.Driver;

public class FabricaConexao {

	private static String USUARIO = "root"; // Nome do usuario
	private static String SENHA = "root";//Senha do usuario
	
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/db_cadastro_jogador?useTimezone=true&serverTimezone=UTC";//URL DO BANCO
	
	private static String BANCO_URL_USUARIOS = "jdbc:mysql://localhost:3306/db_usuarios?useTimezone=true&serverTimezone=UTC";//URL DO BANCO
	
	public Connection criarConexao() {
		Connection conexao;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Indica o Drive que vai ser usado
			
			conexao = DriverManager.getConnection(BANCO_URL,USUARIO,SENHA);// Cria a conexão
			System.out.println("Deu certo a conexão!!!");
		
		} catch (Exception mensagemErro) {
			conexao = null;
			System.out.println("Problema ao conectar!!");
			System.out.println("#######################");
			System.out.println(mensagemErro);// Apresenta o erro no console
			
		}
	
		
		return conexao;
	}
	
	
	public Connection criarConexaoDb_usuarios() {
		Connection conexao;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Indica o Drive que vai ser usado
			
			conexao = DriverManager.getConnection(BANCO_URL_USUARIOS,USUARIO,SENHA);// Cria a conexão
			System.out.println("Deu certo a conexão!!!");
		
		} catch (Exception mensagemErro) {
			conexao = null;
			System.out.println("Problema ao conectar!!");
			JOptionPane.showMessageDialog(null, "Erro de banco");
			System.out.println("#######################");
			System.out.println(mensagemErro);// Apresenta o erro no console
			
		}
	
		
		return conexao;
	}
	
	
	
}
