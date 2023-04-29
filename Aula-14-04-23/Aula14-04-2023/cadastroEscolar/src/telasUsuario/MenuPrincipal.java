package telasUsuario;

import javax.swing.JOptionPane;

import arquivoGerente.RegistrarArquivo;
import cadastros.CadastroGeral;
import entidades.Aluno;

public class MenuPrincipal {
	CadastroGeral gCadastroGeral = new CadastroGeral();
	RegistrarArquivo rArquivo = new RegistrarArquivo();
	
	public void menu() {
		
		int opcao;
		Aluno alunoCadastro = new Aluno();
		
		Boolean sair = true;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opcao : 1 Aluno - 2 Professor - 3 Coordenado - 4 para sair"));
			
			if(opcao == 1){
				
				alunoCadastro = gCadastroGeral.recebeAluno();
				rArquivo.registrarAluno(alunoCadastro);
				
			}
			
			if(opcao == 2){
				System.out.println("cadastra Professor");
			}
			
			if(opcao == 3){
				System.out.println("cadastra Coordenador");
			}
			
			if(opcao == 4){
				System.out.println("sair");
				sair = false;
			}
			
		}while(sair);
		
		System.exit(0);
		
		
		
		
		
		
		
		
	}
	
	
	
}
