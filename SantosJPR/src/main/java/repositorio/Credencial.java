package repositorio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import modelo.Credenciais;

public class Credencial implements Serializable {

	private static final long serialVersionUID = 1L;
	
private EntityManager manager;

public Credencial() {
	
}
	
	public Credencial(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Credenciais> pesquisar(String descricao){
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		
		CriteriaQuery<Credenciais> criteriaQuery = criteriaBuilder.createQuery(Credenciais.class);
		Root<Credenciais> root = criteriaQuery.from(Credenciais.class);
		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.like(root.get("descricao"), descricao + "%"));
		
		TypedQuery<Credenciais> query = manager.createQuery(criteriaQuery);
		
		
 		return query.getResultList();
 		
 		

}
	
}
