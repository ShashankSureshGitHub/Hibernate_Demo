package com.js.demo2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SaveBook {
	
		public static void main(String[] args) {
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
			EntityManager em= emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			Book b=new Book();
			b.setId(3);
			b.setName("Monk who sold golden ferrari");
			b.setAuthor("Robin sharma");
			b.setNumofpages(568);
			b.setPrice(668.5);
			et.begin();
			em.persist(b); // to perform crud operations we need entity manager object...persit() is an inbuilt mathod to insert values in hibernate 
			et.commit();

		}

}
