package com.spring.jpa;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class PersonTest {

	@Test
	public void save() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("myJPA");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		em.persist(new Person("Mike"));

		em.getTransaction().commit();

		em.close();

		factory.close();

		// fail("Not yet implemented");
	}

}
