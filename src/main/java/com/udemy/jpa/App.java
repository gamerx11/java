package com.udemy.jpa;

import java.util.List;

import javax.persistence.*;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal_jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		entityManager.getTransaction().begin();
		
		TypedQuery<Person> query = entityManager.createNamedQuery("person.getPersonByName",Person.class);
		query.setParameter("name", "Joel");
		
		List<Person> people = (List<Person>) query.getResultList();
		
		for(Person p : people) {
			System.out.println(p);
		}	
		
		//search for a record based on the key
		//Person p = entityManager.find(Person.class, 3);
		//System.out.println(p);
		
		//remove a record
		//entityManager.remove(p);
		
/*		//enter in records
		Person p1 =  new Person ("Joe",18);
		Person p2 =  new Person ("Joel",34);
		Person p3 =  new Person ("Adam",55);
		Person p4 =  new Person ("Nicola",26);

		
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.persist(p4);
		//commit changes
		entityManager.getTransaction().commit();
		
		Query query = entityManager.createNativeQuery("SELECT * FROM person_table where age < 30",Person.class);
		
		}
		
*/	
		entityManager.flush();
		entityManager.close();
		entityManagerFactory.close();
	}

}
