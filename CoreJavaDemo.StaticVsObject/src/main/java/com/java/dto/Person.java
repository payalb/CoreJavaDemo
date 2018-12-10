package com.java.dto;//first statement

public class Person {
	//Encapsulation: using proper access modifiers

	private String name;
	private int id;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// validations
		if (id > 0) {
			this.id = id;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
