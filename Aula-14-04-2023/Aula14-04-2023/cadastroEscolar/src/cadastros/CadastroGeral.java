package cadastros;

import javax.swing.JOptionPane;

import entidades.Aluno;

public class CadastroGeral {

	public Aluno recebeAluno() {
		Aluno al = new Aluno();
		
		al.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
		al.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno: "));
		al.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));
	
		
		return al;
		
	}
	
	
	
}
