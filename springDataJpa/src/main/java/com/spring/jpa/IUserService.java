package com.spring.jpa;


public interface IUserService{

	 void saveUser(Person user);
	    
	    /**
	     * ����id�����û�
	     * @param id
	     * @return
	     */
	 Person findUserById(Integer id);
	    
	    /**
	     * �����û�
	     * @param user
	     */
	    void updateUser(Person user);
	    
	

}
