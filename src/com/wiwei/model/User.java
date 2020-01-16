package com.wiwei.model;

public class User {

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	private String username;
	public User(String username, String password, String sex, int age, boolean isAdmin) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.isAdmin = isAdmin;
	}
	private String password;
	private String sex;
	private int age;
	private boolean isAdmin = false;
	
}
