package orm.actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class InserirAluno {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o nome do aluno: ");
	        String nome = scanner.nextLine();

	        System.out.println("Digite o e-mail do aluno: ");
	        String email = scanner.nextLine();

	        System.out.println("Digite o telefone do aluno: ");
	        String telefone = scanner.nextLine();

	        System.out.println("Digite a data de nascimento do aluno: ");
	        String dataNascimento = scanner.nextLine();

	        System.out.println("Digite a naturalidade do aluno: ");
	        String naturalidade = scanner.nextLine();

	        System.out.println("Digite o endereço do aluno: ");
	        String endereco = scanner.nextLine();

	        Aluno a1 = new Aluno(null, nome, email, telefone, dataNascimento, naturalidade, endereco);

	        System.out.println("Aluno criado: " + a1);

	        scanner.close();
	    
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(a1);
				
		em.getTransaction().commit();
		
		System.out.println("pronto");
		
			}

}
