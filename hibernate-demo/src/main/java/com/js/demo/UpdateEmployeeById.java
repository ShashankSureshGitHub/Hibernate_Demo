package com.js.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployeeById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee e=em.find(Employee.class, 4);
		if(e!=null)
		{
			e.setEmail("ion@gmail.com");
			e.setSalary(56000);
			et.begin();
			em.merge(e);
			et.commit();
			System.out.println("Updated successfully");
		}
		else
		{
			System.out.println("No employee");
		}

	}

}
