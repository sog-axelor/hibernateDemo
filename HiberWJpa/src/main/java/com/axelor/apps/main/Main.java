package com.axelor.apps.main;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.axelor.apps.Emp;

public class Main {

	public static void main(String[] args) {

		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("Emp_detail");  
	        EntityManager em=emf.createEntityManager();  
	        em.getTransaction().begin();  
	        
	        
	        
	        
//	        Emp e1 = new Emp();						//insert
//	        e1.setId(12);
//	        e1.setName("test");
//	        e1.setCity("test");
//	        em.persist(e1);
//	        em.getTransaction().commit();  
//	        emf.close();
//	        em.close();
//	        System.out.print("added successfully");
	        
	        Emp e1 = em.find(Emp.class,12);				//update	and  //Search
	        System.out.println("Before Updation");
	        System.out.println("Emp id = "+e1.getId());  
	        System.out.println("EMp Name = "+e1.getName());  
	        System.out.println("Emp Age = "+e1.getCity());
	        
	        e1.setCity("Surat");
	        em.getTransaction().commit();
	        System.out.println("After Updation");
	        System.out.println("Emp id = "+e1.getId());  
	        System.out.println("EMp Name = "+e1.getName());  
	        System.out.println("Emp Age = "+e1.getCity());
	        emf.close();
            em.close();
	        
	        
	        
//            Emp e1 = em.find(Emp.class,11);				//delete
//            em.remove(e1);
//            em.getTransaction().commit();
//            emf.close();
//            em.close();
//	        System.out.print("Deleted successfully");
	        
	        
	        
	}

}
