package com.js.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		
		// suppose to use JPQL query in hibernate...similar to sql query used in JDBC
		
		String query="select e from Employee e"; // Employee e is capital because we use class name is Hibernate
		Query q=em.createQuery(query);
		List<Employee> employees=q.getResultList();
		if(employees.size()>0)
		{
			for(Employee e:employees)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("no employees in table");
		}
		

	}

}
