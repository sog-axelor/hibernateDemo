package com.axelor.apps.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.axelor.apps.Emp;

public class Main {

	public static void main(String[] args) {
		
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();    
		  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		  SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		  Session session = factory.openSession();  
		  Transaction t = session.beginTransaction();   
		  
//		  Emp e1 = new Emp();					//insert
//		  e1.setName("test");
//		  e1.setCity("test");
//		  session.save(e1);  
//		  t.commit();  
//     	  System.out.println("successfully saved");    
//		  factory.close();  
//		  session.close();  
		  
		  
		  
		  										
//			int id = 1;					//Delete
//			Emp e1 = session.get(Emp.class, new Integer(id));
//			session.delete(e1);
//			session.getTransaction().commit();
//			System.out.println("record deleted.....");
		  
		  
		  

//			int id = 2;					//updater
//			Emp e1 = session.get(Emp.class, new Integer(id));
//			e1.setName("Sukh");
//			e1.setCity("Amritsar");
//			session.saveOrUpdate(e1);
//			session.getTransaction().commit();
//			System.out.println("Record updated succesfully..."); 
		  
		  
		  Query query = session.createQuery("FROM Emp");
			List<Emp> e1 = query.list();
			System.out.println("-------------Records are -------------");
			for(Emp empObj : e1)
			{
				System.out.print("\n Emp Id  : " + empObj.getId() + " \n Emp Name : " + empObj.getName() +"\n");
			}
			System.out.print("");
		
	}

}
