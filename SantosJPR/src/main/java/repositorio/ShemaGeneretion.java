package repositorio;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
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
