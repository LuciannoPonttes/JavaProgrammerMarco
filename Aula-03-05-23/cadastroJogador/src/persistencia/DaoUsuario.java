package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




import entidades.Usuario;

public class DaoUsuario {

	
	
	
	public List<Usuario> retornaListaUsuarioDao(){
		FabricaConexao fabricaConexaoBancoDados = new FabricaConexao();
		String comandoSqlBuscar = "SELECT * FROM tb_usuario";
		
		Connection conexaoRecebida = null;
		PreparedStatement declaracaoComando = null;
		
		ResultSet resultadoTabela = null;
		
		List<Usuario> listaUsuario = new ArrayList<>();
		
		try {
			conexaoRecebida = fabricaConexaoBancoDados.criarConexaoDb_usuarios();
			declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSqlBuscar);
			
			resultadoTabela = declaracaoComando.executeQuery();
			
			
			while (resultadoTabela.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setMatricula(resultadoTabela.getString("matricula"));
				usuario.setNome(resultadoTabela.getString("nome"));
				usuario.setEmail(resultadoTabela.getString("email"));
				usuario.setTipoUsuario(resultadoTabela.getString("tipo_usuario"));
				usuario.setSenha(resultadoTabela.getString("senha"));
				listaUsuario.add(usuario);
			}
			
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listaUsuario;
	}
	
	
	
	
	
	
}
