package com.js.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployeeById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee e=em.find(Employee.class, 5);
		if(e!=null)
		{
			et.begin();
			em.remove(e);
			et.commit();
			System.out.println("Deleted Successfully");
		}
		else
		{
			System.out.println("No Employee");
		}

	}

}
