package com.js.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		Employee e=new Employee();
		e.setId(5);
		e.setName("shivi");
		e.setEmail("shivi@gmail.com");
		e.setPhone(7830913361l);
		e.setSalary(98000);
		EntityTransaction et=em.getTransaction(); //we need transaction for dml operations
		et.begin();
		em.persist(e); // write the values in object into the row
		et.commit(); // dml operations are not auto-committed hence commit


	}
}
