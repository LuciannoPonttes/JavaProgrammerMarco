package repositorio;

import java.util.List;

import entidades.Usuario;



public interface InterfaceUsuario {

	
	
	public List<Usuario> retornaUsuarios();
	
	public Usuario buscarUsuario(String matricula);
	
	
}
