package com.spring.jpa;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserRepositoryTest {

	@Autowired
    private UserService userService;
	private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	@Autowired
	private Person person;
	@Test
	public void testSaveT(
			) {
		
		System.out.println(person.hashCode());
		userService.saveUser(new Person("Arron"));
	}



}
