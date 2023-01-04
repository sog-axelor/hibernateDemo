package com.unique.apps.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.apps.Bank;
import com.unique.apps.Consumer;

public class MainBank {
	
	public static void main(String[] args)
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Consumer c1 = new Consumer();
		c1.setC_name("Mohit Singh");
		c1.setC_city("West Bangal");
		
		Consumer c2 = new Consumer();
		c2.setC_name("Sohan Singh");
		c2.setC_city("Rajsthan");
		
		Consumer c3 = new Consumer();
		c3.setC_name("Rohit Singh");
		c3.setC_city("Gujarat");
		
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		List<Consumer> cons = new ArrayList();
		cons.add(c1);
		cons.add(c2);
		cons.add(c3);
		
		Bank bk = new Bank();
		bk.setBank_Name("State Bank of India");
		bk.setConsumerList(cons);
		em.persist(bk);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}
