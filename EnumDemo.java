package day2;

import day2.Employee.Gender;

//enum
public class EnumDemo {
public static void main(String[] args) {
	Employee obj= new Employee();
	obj.gender=Gender.FEMALE;
	obj.name= "Payal";
	
	switch(obj.gender) {
	
	case FEMALE:
			System.out.println("Female");
			break;
	default:
			System.out.println("Male");
			break;
	}
}
}


//Gender: Male, Female
//Occupation: Service, Business, Not Working



class Employee{
	String name;
	int age;
	Gender gender;
	Occupation occupation;
	enum Gender{//constructor,, methods, properties
		MALE, FEMALE; // public static final

	}
	
}

/*
class Gender{
	public static final Gender MALE= new Gender();
	public static final Gender FEMALE= new Gender();
}*/