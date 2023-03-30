import java.util.Scanner;
public class Principal{

   public static void main(String[] args){

	// Inicializar o objeto
	Animal animalUm  = new Animal();
	Animal animalDois  = new Animal();
	
	// Criando o objeto Mamifero
	Mamifero mamiferoUm = new Mamifero();

	//Criar o objeto Ave

	Ave aveUm = new Ave();

	// Objeto para receber dados atraves do console
	Scanner entradaDados = new Scanner(System.in);

		


	System.out.println("##Cadastro De Animal##");
	System.out.println("Digite o nome:");
	animalUm.nome = entradaDados.next();
	
	System.out.println("#####################");
	
	System.out.println("Digite a especie do Animal:");
	animalUm.especie = entradaDados.next();

	
	System.out.println(animalUm.nome);
	System.out.println(animalUm.especie);

	System.out.println("##Cadastre o segundo animal##");

	System.out.println("Digite o nome:");
	animalDois.nome = entradaDados.next();
	
	System.out.println("#####################");
	
	System.out.println("Digite a especie do Animal:");
	animalDois.especie = entradaDados.next();

	
	System.out.println(animalDois.nome);
	System.out.println(animalDois.especie);

	System.out.println("##########Cadastro de Mamifero###########");
	
	System.out.println("Digite o nome do Mamifero:");
	mamiferoUm.nome = entradaDados.next();

	System.out.println("Digite a especie do Mamifero:");
	mamiferoUm.especie = entradaDados.next();

	System.out.println("Digite a cor do pelo do Mamifero:");
	mamiferoUm.corPelo = entradaDados.next();

	System.out.println(mamiferoUm.nome);
	System.out.println(mamiferoUm.especie);
	System.out.println(mamiferoUm.corPelo);
	

	System.out.println("##########Cadastro de Ave ###########");

	System.out.println("Digite o nome da Ave:");
	aveUm.nome = entradaDados.next();

	System.out.println("Digite a especie da Ave:");
	aveUm.especie = entradaDados.next();

	System.out.println("Digite a cor da pena da Ave:");
	aveUm.corPena = entradaDados.next();

	System.out.println(aveUm.nome);
	System.out.println(aveUm.especie);
	System.out.println(aveUm.corPena);

	





		

   }



}