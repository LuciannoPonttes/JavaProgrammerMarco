package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import entidades.Usuario;
import servico.GerenciaSessao;
import telas.TelaMenuJogador;



public class ControladorTelaLogin implements ActionListener {
	JTextField textMatriculaRecebido;	
	JPasswordField textSenhaRecebido;	
	JFrame frameTelaLoginRecebido;
	
	
	public ControladorTelaLogin(JTextField textMatriculaRecebido, 
			JPasswordField textSenha , JFrame frameTelaLogin) {
		this.textMatriculaRecebido = textMatriculaRecebido;
		this.textSenhaRecebido = textSenha;
		this.frameTelaLoginRecebido = frameTelaLogin;
	}
	
	GerenciaSessao gerenciaSessao = new GerenciaSessao();
	TelaMenuJogador telaMenuJogador = new TelaMenuJogador();
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Usuario usuarioEncontrado = gerenciaSessao.validaUsuario(textMatriculaRecebido.getText(), textSenhaRecebido.getText());
		
		if(usuarioEncontrado != null) {
			JOptionPane.showMessageDialog(null, "Bem vindo(a) " + usuarioEncontrado.getNome());
			System.out.println("Iniciar o sistema");
			frameTelaLoginRecebido.setVisible(false);
			
			telaMenuJogador.criarTelaMenuJogador(usuarioEncontrado);
			
			textSenhaRecebido.setText(null);
			textMatriculaRecebido.setText(null);
		
		}else {
			JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos!! ");
		
		}
		
	}
	
}
