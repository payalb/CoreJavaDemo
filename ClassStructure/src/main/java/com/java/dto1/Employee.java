package com.java.dto1;
//The classname in a package shud be unique,
//i can place 2 files withs ame name in diff packages
import com.java.dto.Person; 

//Employee is not an address (Cannot use inheritance)
public class Employee extends Person{ //Inheritance
	//Is a relationship between employee and person
//has a relationship: between employee and address
	Address address;
	//Address has a default scope, so not visible outside the package
	String name;
}
