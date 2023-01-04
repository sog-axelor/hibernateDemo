
package com.unique.apps.main;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.apps.*;

public class Main{

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("book_issue");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		   Student st1=new Student();  
           st1.setS_name("Hirendra");  
                        
           Library lib1=new Library();  
           lib1.setB_name("Adavanced Java");  
           lib1.setStud(st1);  
           em.persist(lib1);  
           
           
//		Library e1 = em.find(Library.class,8);				//delete
//        em.remove(e1);
//        em.getTransaction().commit();
//        emf.close();
//        em.close();
//	        System.out.print("Deleted successfully");
	        
           
	System.out.print("Added Student info SuccessFully");

		em.getTransaction().commit();
		em.close();
		emf.close();
		
		

		
	}
}