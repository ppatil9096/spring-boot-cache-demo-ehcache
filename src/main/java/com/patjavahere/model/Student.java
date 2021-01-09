package com.patjavahere.model;

public class Student {
	private String name;
	private String email;
	private int id;

	public Student(final String name, final String email, final int id) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", id=" + id + "]";
	}

}
