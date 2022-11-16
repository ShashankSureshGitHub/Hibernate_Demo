package com.js.demo2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBookById {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Book b=em.find(Book.class,2);
		if(b!=null)
		{
			b.setAuthor("ashwin");
			b.setPrice(250);
			et.begin();
			em.merge(b);
			et.commit();
			System.out.println("Updated Successfully");
		}
		else
		{
			System.out.println("Book not present");
		}

	}

}
