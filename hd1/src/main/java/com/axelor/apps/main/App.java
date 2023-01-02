package com.axelor.apps.main;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.axelor.apps.Student;

public class App {

	 public static void main(String[] args)
	 {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		    
		    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		    Session session = factory.openSession();  
		    //update(session);
		     //read(session);
		     //insert(session);
		     //delete(session);		//delete record
		    System.out.println("Hibenate crud using POstgreSQl");
		    System.out.println("Enter the choice 1.view 2.Insert 3.Delete 4.update");
		    Scanner sc = new Scanner(System.in);
		    int ch = sc.nextInt();
		    switch(ch)
		    {
		    case 1:
		    	read(session);
		    	break;
		    case 2:
		    	insert(session);
		    	break;
		    case 3:
		    	read(session);
		    	delete(session);
		    	break;
		    case 4:
		    	read(session);
		    	update(session);
		    	break;
		    default:
		    	 System.out.println("Wrong choice...");  
	
		    }
		     session.close();
	 }
	 
	 private static void insert(Session session)
	 {
	     Student student1 = new Student();
	     Scanner sc = new Scanner(System.in);
		 System.out.println("ENter the Name : ");  
		 String name = sc.next();
		 System.out.println("ENter the CIty : ");  
		 String city = sc.next();
	     student1.setName(name);
	     student1.setCity(city);
	     session.save(student1);
		 session.beginTransaction();
		 session.save(student1);
		 session.getTransaction().commit();
		 System.out.println("Record saved succesfully...");
	 }
	 private static void delete(Session session)
	 {
		 System.out.println("ENter the id to delete : ");  
		 Scanner sc = new Scanner(System.in);
		 int id = sc.nextInt();
		 Student student1 = (Student) session.get(Student.class, new Integer(id));
		 session.beginTransaction();
		 session.delete(student1);
		 session.getTransaction().commit();
		 System.out.println("Record deleted succesfully..."); 
	 }
	
	 private static void read(Session session)
	 {
		 Query query = session.createQuery("FROM Student");
		 List<Student> Students = query.list();
		 //Students.forEach(obj -> System.out.println(obj.getId()));
		 System.out.println("Reading student records...");
		 for (Student studentObj : Students) {
		 System.out.println(" Id   : " + studentObj.getId());	 
		 System.out.println(" Name : " + studentObj.getName());
		 System.out.println(" City : " + studentObj.getCity());
		 System.out.println("");
		 
		 }
	 }
	 private static void update(Session session)
	 {
		 System.out.println("ENter the Id to update : ");  
		 Scanner sc = new Scanner(System.in);
		 int id = sc.nextInt();
		 Student student1 = (Student) session.get(Student.class, new Integer(id));
		 System.out.println("ENter the Name : ");  
		 String name = sc.next();
		 System.out.println("ENter the CIty : ");  
		 String city = sc.next();
		 student1.setName(name);
		 student1.setCity(city);
		 session.beginTransaction();
		 session.saveOrUpdate(student1);
		 session.getTransaction().commit();
		 System.out.println("Record updated succesfully..."); 
	 }
	 

}



