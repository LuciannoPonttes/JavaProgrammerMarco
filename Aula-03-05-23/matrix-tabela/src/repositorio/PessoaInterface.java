package repositorio;

import java.util.List;

import entidades.Pessoa;

public interface PessoaInterface {

	
	public void salvar(Pessoa pessoa);
	
	public List<Pessoa> retonarListaPessoas();
	
	
}
