package com.axelor.apps.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.axelor.apps.Emp;
public class App{

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
	
		
//		insert
//		Emp e1 = new Emp();
//		e1.setEname("sukh");
//		e1.setEcity("surat");
//		session.beginTransaction();
//		session.save(e1);
//		session.getTransaction().commit();
//		
//		 System.out.println("Record saved succesfully...");
		
		
//		Delete
//		int id = 11;
//		Emp e1 = session.get(Emp.class, new Integer(id));
//		session.beginTransaction();
//		session.delete(e1);
//		session.getTransaction().commit();
//		System.out.println("record deleted.....");
		
		
		//read
//		
//		Query query = session.createQuery("FROM Emp");
//		List<Emp> e1 = query.list();
//		System.out.println("-------------Records are -------------");
//		for(Emp empObj : e1)
//		{
//			System.out.print("\n Emp Id  " + empObj.getEid() + " \n Emp Name : " + empObj.getEname() + " \n Emp City " + empObj.getEcity() + "\n");
//		}
//		System.out.print("");
		
		
		//update
		int id = 10;
		Emp e1 = session.get(Emp.class,new Integer(id));
		e1.setEname("sukh");
		e1.setEcity("punjab");
		session.beginTransaction();
		session.saveOrUpdate(e1);
		session.getTransaction().commit();
		System.out.println("Record updated succesfully..."); 

		
		
		
		
	}
	
	

}





