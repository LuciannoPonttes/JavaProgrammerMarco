package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;

public class PessoaRepositorio implements PessoaInterface {
	
	List<Pessoa> listaPessoas = new ArrayList<>();
	
	
	@Override
	public void salvar(Pessoa pessoa) {
	
		listaPessoas.add(pessoa);
	}


	@Override
	public List<Pessoa> retonarListaPessoas() {
		
		return listaPessoas;
	}

	
	
	
	
	
}
