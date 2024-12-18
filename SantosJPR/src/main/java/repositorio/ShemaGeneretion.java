package repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Funcionarios;



public class ShemaGeneretion {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroPU");
		
        EntityManager em = emf.createEntityManager();
        
        List<Funcionarios> lista = em.createQuery("from Funcionarios", Funcionarios.class).getResultList();
        
        System.out.println(lista);
        
        em.close();
        emf.close();
	}

}
