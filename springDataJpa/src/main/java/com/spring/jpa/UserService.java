package com.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService implements IUserService{

	@Autowired
    private UserRepository userRepository;//×¢ÈëUserRepository
	
	
	public void saveUser(Person user) {
		userRepository.save(user);
		
	}

	public Person findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(Person user) {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		UserService test = new UserService();

		test.saveUser(new Person("hack"));
	}
	
}
