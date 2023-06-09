package servico;

import entidades.Usuario;
import repositorio.RepositorioUsuario;

public class GerenciaSessao {
	
	RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
	
	public Usuario validaUsuario(String matricula, String senha) {
		
		Usuario usuarioEcontrado = repositorioUsuario.buscarUsuario(matricula);
		
		if(usuarioEcontrado != null) {
			
			if(usuarioEcontrado.getSenha().equals(senha)) {
				return usuarioEcontrado;
			}
		}
		
		return null;
	}
}
