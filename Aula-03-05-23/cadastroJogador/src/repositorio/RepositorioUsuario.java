package repositorio;


import java.util.List;

import entidades.Usuario;
import persistencia.DaoUsuario;



public class RepositorioUsuario implements InterfaceUsuario {

	DaoUsuario daoUsuario = new DaoUsuario();
	
	

	@Override
	public List<Usuario> retornaUsuarios() {
		// TODO Auto-generated method stub
		return daoUsuario.retornaListaUsuarioDao();
	}

	@Override
	public Usuario buscarUsuario(String matricula) {
		
		for (Usuario usuarioBusca:retornaUsuarios() ) {
			if(matricula.equals(usuarioBusca.getMatricula())) {
				return usuarioBusca;
			}	
		}
		return null;
	}

	
	

	
	
	
	
	
	

	
	
	
}
