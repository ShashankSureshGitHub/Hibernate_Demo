package com.js.demo2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllBooks {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		String query="select b from Book b";
		Query q= em.createQuery(query);
		List<Book> books=q.getResultList();
		if(books.size()>0)
		{
			for(Book b: books)
			{
				System.out.println(b);
			}
		}
		else
		{
			System.out.println("No books in the table");
		}

	}

}
