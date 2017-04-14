package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Cliente;

public class ClienteDAO {

	private EntityManagerFactory emf;
	private EntityManager        em;
	
	public ClienteDAO(){
		
		emf = Persistence.
			  createEntityManagerFactory("PrCliente");
		
	}
	
	public void salvar(Cliente cliente){
	  em = emf.createEntityManager();
	  em.getTransaction().begin();
	  em.persist(cliente);
	  em.getTransaction().commit();
	  em.close();
		
	}
	
	
}
