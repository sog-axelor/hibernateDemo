
package com.axelor.apps.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.axelor.apps.Employee;

public class App{
	public static void main(String[] args)
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	    Session session = factory.openSession();  
	    Transaction t = session.beginTransaction();   
	                
	        Employee e1=new Employee();   
	        e1.setName("test");
	        e1.setSalary(10000);
	        e1.setDesg("manager");
	        session.save(e1);  
	        t.commit();  
	        System.out.println("successfully saved");    
	        factory.close();  
	        session.close(); 
	}
}