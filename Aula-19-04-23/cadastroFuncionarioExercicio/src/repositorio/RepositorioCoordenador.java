package repositorio;

import entidades.Coordenador;
import gerenciadorArquivo.ManipulaArquivo;


//Classe que irá interagir com os metodos de persistencia e consultas
public class RepositorioCoordenador implements InterfaceCoordenador {

	
	//Metodo sobreEscrito da InterfaceCoordenador
	@Override
	public boolean salvarCoordenador(Coordenador coordenador) {
		Boolean respostaSalvamento;
		ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
		respostaSalvamento = manipulaArquivo.registrarCoordenador(coordenador);
		
		return respostaSalvamento;
	}

}
