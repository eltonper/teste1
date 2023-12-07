package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Aluno;

public class ListarAlunos {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager manager = factory.createEntityManager();
		
		//Query em JPQL que é traduzida para o SQL do banco definido persistence.xml
		Query query = manager.createQuery("select a from Aluno a");
		
		List<Aluno> lista = query.getResultList();
		
		for (Aluno a : lista) {
			System.out.println(a.getNome());
		}
		
		manager.close();
		factory.close();
		
	}

}