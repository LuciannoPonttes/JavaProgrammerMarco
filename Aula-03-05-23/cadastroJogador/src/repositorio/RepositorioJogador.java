package repositorio;

import java.util.ArrayList;
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

}
