package repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entidades.Jogador;

public class RepositorioJogador implements InterfaceJogador {

	List<Jogador> listaJogares = new ArrayList<>();
	
	@Override
	public void salvarJogador(Jogador jogador) {
		listaJogares.add(jogador);
		
	}

	@Override
	public List<Jogador> retornaListaJogadores() {
		
		return listaJogares;
	}

	@Override
	public boolean deletarJogador(Jogador jogador) {
		boolean resultado;
		
		try {
			
			listaJogares.remove(jogador);
			resultado = true;
		
		} catch (Exception e) {
			resultado = false;
		}
		
		return resultado;
	}

	@Override
	public Jogador buscarJogador(String cpf) {
		
		for (Jogador jogadorVerificado:retornaListaJogadores()) {
			if(jogadorVerificado.getCpf().equals(cpf)) {
				
				return jogadorVerificado;
			}
			
		}
	
		return null;
	}

}
