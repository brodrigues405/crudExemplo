package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	

	public static EntityManager getConnection(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud");
		return emf.createEntityManager();
	}


}
