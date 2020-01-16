package com.wiwei.service;

import com.wiwei.dao.UserDao;
import com.wiwei.model.*;
public class UserService {

	public boolean register(String username,String password,String sex,int age) {
		
	    UserDao userDao = new UserDao();
	    boolean isExist = userDao.isExist(username);
	    if(isExist) {
	    	return false;
	    }
	    else {
	    	userDao.addUser(username,password,sex,age);
	    	return true;
	    }
	}
	
	public User login(String username,String password) {
		return new UserDao().getUserByUP(username, password);
	}


}


