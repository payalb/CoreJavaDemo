package com.java.dto1;

import com.java.dto.Person; 

public class Employee extends Person{ //Inheritance
	
	public void printDetails() { //Instance method
		System.out.println(this.phoneNumber);//Now a property of employee class
		System.out.println(id);//Id would be inherited?
		System.out.println(name);//accessible as protected and visible in child class in diff package
		System.out.println(address);
	}
}
