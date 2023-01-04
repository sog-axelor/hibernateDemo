package com.unique.apps.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.apps.Train;
import com.unique.apps.Traveler;

public class Main{
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Train tr = new Train();
		tr.setTrain_name("Shtabadi Express");
		em.persist(tr);
		
		Traveler tv = new Traveler();
		tv.setName("Mohab Sharma");
		tv.setTo_city("Mumbai Central");
		tv.setFrom_city("Ahemedabad");
		tv.setTrain(tr);
		
		em.persist(tv);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}