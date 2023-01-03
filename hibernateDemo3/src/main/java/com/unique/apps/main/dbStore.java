
package com.unique.apps.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.apps.Department;
import com.unique.apps.EMployee;

public class dbStore {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Department d1 = new Department();
		d1.setName("Department of computer Science");
		 em.persist(d1);

		EMployee e1 = new EMployee();
		e1.setEname("JOhn");
		e1.setSalary("10000");
		e1.setDept(d1);
		em.persist(e1);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}
}