package com.js.demo2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBookById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Book b=em.find(Book.class,3);
		if(b!=null)
		{
			et.begin();
			em.remove(b);
			et.commit();
			System.out.println("Successfully deleted");
		}
		else
		{
			System.out.println("No book in the given id");
		}

	}

}
