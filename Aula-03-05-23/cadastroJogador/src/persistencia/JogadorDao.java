package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

import entidades.Jogador;

//Responsavel por acessar a tabela do objeto jogador
public class JogadorDao {

	public boolean salvarJogadorBanco(Jogador jogador) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		boolean salvamento = false; //Resposta do metodo
		String comandoSqlInsert = "insert into tabela_jogador(cpf,nome) values(?,?)";//Comando SQL
		
		
		
		Connection conexaoRecebida = null; // Recebe a conexao
		PreparedStatement declaracaoComando = null; // Preparação do comando
		
		try {
			conexaoRecebida = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlInsert);// Preparação do comanda recebe o banco e o comando SQL
			
			declaracaoComando.setString(1, jogador.getCpf());
			declaracaoComando.setString(2, jogador.getNome());
			
			declaracaoComando.execute();
			
			salvamento = true;
			System.out.println("Jogador Registrado com sucesso");
			
			
		} catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao salvar!");
			salvamento = false;
			
		}finally { // Executar depois de verificar o try(sempre executado)
			
			try {//Try para fechar a conexao
				
				if(conexaoRecebida != null) {// Verifica se a conexão é nula
					conexaoRecebida.close();
				}
				
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
				
			} catch (Exception msgErro) {
				System.out.println(msgErro);
				System.out.println("Erro ao tentar fechar a conexao");
			}
			
		}
		
		
		return salvamento;
		
	}
	
	
	public boolean deletarJogadorPeloCpf(String cpf) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		boolean exclusao = false; //Resposta do metodo
		
		String comandoSqlDeletar = "delete from tabela_jogador where cpf = ?";
		
		Connection conexaoRecebida = null; // Recebe a conexao
		PreparedStatement declaracaoComando = null; // Preparação do comando
		
		try {
			conexaoRecebida = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlDeletar);// Preparação do comanda recebe o banco e o comando SQL
			
			declaracaoComando.setString(1, cpf);
			
			
			declaracaoComando.execute();
			
			exclusao = true;
			System.out.println("Jogador Deletado com sucesso");
			
			
		} catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao Deletar!");
			exclusao = false;
			
		}finally { // Executar depois de verificar o try(sempre executado)
			
			try {//Try para fechar a conexao
				
				if(conexaoRecebida != null) {// Verifica se a conexão é nula
					conexaoRecebida.close();
				}
				
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
				
			} catch (Exception msgErro) {
				System.out.println(msgErro);
				System.out.println("Erro ao tentar fechar a conexao");
			}
			
		}
		
	
		
		return exclusao;
	}
	
	public List<Jogador>  buscarListaDeJogador(){
		
		String comandoSqlBuscar = "select * from tabela_jogador";
		
		List<Jogador> listaJogadoresDoBanco = new ArrayList<>();
		
		
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		Connection conexaoRecebida = null; // Recebe a conexao
		PreparedStatement declaracaoComando = null; // Preparação do comando
		
		ResultSet resultadoTabela = null;
		
		try {
			conexaoRecebida = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlBuscar);// Preparação do comanda recebe o banco e o comando SQL
			
			resultadoTabela = declaracaoComando.executeQuery(); // recebe o comando executado pela query
			
			while (resultadoTabela.next()) {
				Jogador jogador = new Jogador();
				
				jogador.setNome(resultadoTabela.getString("nome"));
				jogador.setCpf(resultadoTabela.getString("cpf"));
				
				listaJogadoresDoBanco.add(jogador);
				
			}
			
			
		} catch (Exception mensagemErro) {
			System.out.println(mensagemErro);
			System.out.println("Erro ao Buscar!");
			
			
		}finally { // Executar depois de verificar o try(sempre executado)
			
			try {//Try para fechar a conexao
				
				if(conexaoRecebida != null) {// Verifica se a conexão é nula
					conexaoRecebida.close();
				}
				
				if (declaracaoComando != null) {
					declaracaoComando.close();
				}
				
			} catch (Exception msgErro) {
				System.out.println(msgErro);
				System.out.println("Erro ao tentar fechar a conexao");
			}
			
	}
		
	
		
		
	
		
		
		
		return listaJogadoresDoBanco;
	}
	
	
}
