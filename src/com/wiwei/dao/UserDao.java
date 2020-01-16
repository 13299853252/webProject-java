package com.wiwei.dao;

import com.wiwei.util.DBUtil;
import com.wiwei.model.*;
public class UserDao {

	public boolean isExist(String username) {
		return DBUtil.userMap.containsKey(username);
	}
	public boolean addUser(String username,String password,String sex,int age) {
		if(isExist(username)) return false;
		User user = new User(username,password,sex,age,false);
		DBUtil.userMap.put(user.getUsername(), user);
		return true;
	}
	public User getUserByUP(String username,String password) {
		if(isExist(username)==false) return null;
		User u = DBUtil.userMap.get(username);
		if(u.getPassword().equals(password)) return u;
		else return null;
	}

}
