package com.spring.jpa;


public interface IUserService{

	 void saveUser(Person user);
	    
	    /**
	     * 根据id查找用户
	     * @param id
	     * @return
	     */
	 Person findUserById(Integer id);
	    
	    /**
	     * 更新用户
	     * @param user
	     */
	    void updateUser(Person user);
	    
	

}
