package repositorio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import modelo.Funcionarios;

public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
public static EntityManager manager;
	
	public Funcionario () {
		
	}
	
	public Funcionario(EntityManager manager) {
		Funcionario.manager = manager;
	}
	
	public static Funcionarios porId(Long id) {
		return manager.find(Funcionarios.class, id);
	}
	
	public static List<Funcionarios> pesquisar(String nome) {
		TypedQuery<Funcionarios>query = manager.createQuery("from Empresa where nomeFuncionario like :nomeFuncionario", Funcionarios.class);
		query.setParameter("nomeFuncionario", nome + "%");
		return query.getResultList();
	}
	
	public static Funcionarios guardar(Funcionarios funcionarios) {
		return manager.merge(funcionarios);
	}
	
	public static void remover(Funcionarios funcionarios) {
		 funcionarios = porId(funcionarios.getId());
		 manager.remove(funcionarios);
		
	}

}
