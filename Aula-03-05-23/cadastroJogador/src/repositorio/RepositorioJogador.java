package repositorio;

import java.util.ArrayList;

import java.util.List;

import entidades.Jogador;
import persistencia.JogadorDao;

public class RepositorioJogador implements InterfaceJogador {

	List<Jogador> listaJogares = new ArrayList<>();
	
	JogadorDao jogadorDao = new JogadorDao();
	
	@Override
	public void salvarJogador(Jogador jogador) {
		//listaJogares.add(jogador); Usando a lista
		
		jogadorDao.salvarJogadorBanco(jogador);
		
	}

	@Override
	public List<Jogador> retornaListaJogadores() {
		
		return jogadorDao.buscarListaDeJogador();
		
		//return listaJogares;
	}

	@Override
	public boolean deletarJogador(Jogador jogador) {
		boolean resultado;
		
		resultado = jogadorDao.deletarJogadorPeloCpf(jogador);
		
		/*Para lista
		try {
			
			listaJogares.remove(jogador);
			resultado = true;
		
		} catch (Exception e) {
			resultado = false;
		}
		
		*/
		
		return resultado;
	}

	//Busca o jogador de acordo com o CPF, caso não encontre o metodo retorna null
	@Override
	public Jogador buscarJogador(String cpf) {
		
		for (Jogador jogadorVerificado:retornaListaJogadores()) {
			if(jogadorVerificado.getCpf().equals(cpf)) {
				return jogadorVerificado;
			}
			
		}
	
		return null;
	}

	@Override
	public void alterarJogador(Jogador jogadorNovo) {
		
		jogadorDao.alterarJogador(jogadorNovo);
		
		
		//listaJogares.remove(jogadorAtual);
		//listaJogares.add(jogadorNovo);
	}

}
