package com.unique.apps.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.unique.apps.student;

public class dbStore {
	public static void main(String[] args) {
		  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();    
		  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		  SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		  Session session = factory.openSession();  
		  Transaction t = session.beginTransaction();   

		  //insert
//		  student s1 = new student();
//		  //s1.setId(1);			//auto_increment
//		  s1.setFname("test");
//		  s1.setLname("test");
//		   session.save(s1);  
//		    t.commit();  
//		    System.out.println("successfully saved");    
//		    factory.close();  
//		    session.close();  
		  
		  
//			Delete
//			int id = 0;
//			student s1 = session.get(student.class, new Integer(id));
//			session.delete(s1);
//			session.getTransaction().commit();
//			System.out.println("record deleted.....");
		  
//			update
//			int id = 1;
//			student s1 = session.get(student.class,new Integer(id));
//			s1.setFname("sukh");
//			s1.setLname("punjaban");
//			session.saveOrUpdate(s1);
//			session.getTransaction().commit();
//			System.out.println("Record updated succesfully..."); 
		  
		  
			//read
//			
			Query query = session.createQuery("FROM student");
			List<student> e1 = query.list();
			System.out.println("-------------Records are -------------");
			for(student empObj : e1)
			{
				System.out.print("\n Emp Id  " + empObj.getId() + " \n Emp Name : " + empObj.getFname() + " \n Emp City " + empObj.getLname() + "\n");
			}
			System.out.print("");
		  
		  
			
			
			
			
	}
	
}
