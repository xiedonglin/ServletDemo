package com.edu.bean;

public class Student {
	private int id;
	private String username;
	private String password;
	private String sex;

	public Student() {
		super();
	}

	public Student(String username, String password, String sex, String clase) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.clase = clase;
	}

	public Student(int id, String username, String password, String sex, String clase) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.clase = clase;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	private String clase;
}
