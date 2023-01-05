package com.unique.apps.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.unique.apps.StudentEntity;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		
//        Query query = em.createQuery( "delete from StudentEntity where id=17");
//        query.executeUpdate(); 
//        System.out.println("");  
//
//        
//		Query q1 = em.createNamedQuery("find name");
//		@SuppressWarnings("Unchecked")
//		List<StudentEntity> list = q1.getResultList();
//        System.out.println();  
//
//		  System.out.print("\t id");  
//          System.out.print("\t name");  
//          System.out.println("\t City");  
//         
//       for(StudentEntity s:list)
//		{
//			System.out.print("\t" + s.getId());
//		    System.out.print("\t" +  s.getName( ));  
//            System.out.print("\t" + s.getCity( ));  
//            System.out.println();  
//		}
//		
        Query q2 = em.createQuery("Select count(s) from StudentEntity s");
        Query q1 = em.createQuery("Select s from StudentEntity s");
        Query q3 = em.createQuery("Select MAX(s.id) from StudentEntity s");  
        Query q4 = em.createQuery("Select MIN(s.id) from StudentEntity s");  
        Query q5 = em.createQuery("Select s from StudentEntity s order by s.id asc");  
        Query q6 = em.createQuery("update StudentEntity set city=:n where id=:i");
        Query q7 = em.createQuery("select sum(id) from StudentEntity");
        List<Integer> list=q.list();  
        System.out.println(list.get(0));  
        
	   
//	   q6.setParameter("n","Valsad");
//	   q6.setParameter("i",22);
//	   q6.executeUpdate();

        System.out.println("Number of Records are : " + q2.getSingleResult());
        System.out.println("Max id is : " + q3.getSingleResult());
        System.out.println("Min id is : " + q4.getSingleResult());

        @SuppressWarnings("unchecked")  
        List<StudentEntity> l1 =  (List<StudentEntity>)q1.getResultList();  
        
        System.out.println("Between Clause");  
        System.out.print("id");  
        System.out.print("\t name");  
        System.out.println("\t City");  
          
         for(StudentEntity s:l1)  
         {  
         System.out.print(s.getId());  
         System.out.print("\t"+s.getName());  
         System.out.println("\t"+s.getCity());  
         }  
         
         
         
         @SuppressWarnings("unchecked")  
         List<StudentEntity> l2 =  (List<StudentEntity>)q1.getResultList();  
            
            
          System.out.print("id");  
          System.out.print("\t name");  
          System.out.println("\t city");  
            
           for(StudentEntity s:l2)  
           {  
           System.out.print(s.getId());  
           System.out.print("\t"+s.getName());  
           System.out.println("\t"+s.getCity());  
           }  

         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
 
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
