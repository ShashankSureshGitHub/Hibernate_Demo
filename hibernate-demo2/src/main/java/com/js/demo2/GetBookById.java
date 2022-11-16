package com.js.demo2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBookById {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		Book b=em.find(Book.class, 1);
		if(b!=null)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println("Book not there by the given ID");
		}
				
	}

}
