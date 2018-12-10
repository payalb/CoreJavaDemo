package com.java.dto1;

import com.java.dto.Person;

public class DemoApp {

	public static void main(String[] args) {
		Person object= new Person();//person is public so
		//can be accessed from anywhere
		System.out.println(object.id);// private
		//Protected field: accessible in same package or child
		//classes in a diff package. Demoapp is not a child class of person
		System.out.println(object.name);
		//default: only in the same package
		System.out.println(object.address);
		System.out.println(object.phoneNumber);
	}

}
