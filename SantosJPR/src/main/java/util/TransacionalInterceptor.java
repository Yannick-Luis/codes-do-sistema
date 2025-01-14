package util;

import java.io.Serializable;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;


@Priority(Interceptor.Priority.APPLICATION)
public class TransacionalInterceptor implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager manager;

	
	@AroundInvoke
	public Object invoke(InvocationContext context) throws Exception {
	    EntityTransaction trx = manager.getTransaction();
	    try {
	        if (!trx.isActive()) {
	            trx.begin();
	        }
	        return context.proceed();  
	    } catch (Exception e) {
	        if (trx.isActive()) {
	            trx.rollback();  
	        }
	        throw e;  
	    } finally {
	        if (trx.isActive()) {
	            trx.commit();  
	        }
	    }
	}
}
