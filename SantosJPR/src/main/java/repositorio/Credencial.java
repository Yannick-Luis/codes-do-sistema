package repositorio;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import modelo.Credenciais;

public class Credencial implements Serializable {

	private static final long serialVersionUID = 1L;
	
private EntityManager manager;

public Credencial() {
	
}
	
	public Credencial(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Credenciais> pesquisar(String cargo){
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		
		CriteriaQuery<Credenciais> criteriaQuery = criteriaBuilder.createQuery(Credenciais.class);
		Root<Credenciais> root = criteriaQuery.from(Credenciais.class);
		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.like(root.get("cargo"), cargo + "%"));
		
		TypedQuery<Credenciais> query = manager.createQuery(criteriaQuery);
		
		
 		return query.getResultList();
 		
 		

}
	
}
