package com.unique.apps.main;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.apps.train;
import com.unique.apps.traveler;

public class dbStore{
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		traveler tr1 = new traveler();
		tr1.setName("Rohan");
		tr1.setCity("Mumbai");
		
		traveler tr2 = new traveler();
		tr2.setName("Sohan");
		tr2.setCity("Mumbai");
		
		traveler tr3 = new traveler();
		tr3.setName("Mohan");
		tr3.setCity("Mumbai");
		
		
		em.persist(tr1);
		em.persist(tr2);
		em.persist(tr3);
		
		
		List<traveler> tr = new ArrayList<>();
		tr.add(tr1);
		tr.add(tr2);
		tr.add(tr3);		
		
		train t1 = new train();
		t1.setTrain_name("Vande Bharat Express");
		t1.setTravelerList(tr);
		em.persist(t1);
	    
	    System.out.print("Added SuccessFully....");
	    em.getTransaction().commit();
	    em.close();
	    emf.close();
	    
		
		
		
		
		
	}
}