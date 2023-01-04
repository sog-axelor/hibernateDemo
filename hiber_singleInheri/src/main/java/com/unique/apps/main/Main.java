
package com.unique.apps.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.apps.Card;
import com.unique.apps.Cheque;
import com.unique.apps.Payment;

public class Main{
	
	public static void main(String[] args)
	{
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Payment p = new Payment();
		p.setAmount(12000);
		
		
		Card c = new Card();
		c.setAmount(2000);
		c.setCard_no(455855);
		c.setCard_type("Rupay");
		
		Cheque ch =  new Cheque();
		ch.setAmount(12000);
		ch.setCheque_no(200035);
		ch.setCheque_type("Order");
		
		em.persist(p);
		em.persist(c);
		em.persist(ch);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println( "successfully added" );
		
	
	}
	
}