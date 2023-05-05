package repositorio;

import java.util.List;

import entidades.Jogador;

public interface InterfaceJogador {

	public void salvarJogador(Jogador jogador);
	public List<Jogador> retornaListaJogadores();
	public boolean deletarJogador(Jogador jogador);
	public Jogador buscarJogador(String cpf);
	
}
