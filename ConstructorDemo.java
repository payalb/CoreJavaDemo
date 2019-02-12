package day2;

public class ConstructorDemo {
	public static void main(String[] args) {
		Demo2 obj= new Demo2(); //Calling the constructor
	}
}


class Demo2{
	//Compiler will provide a default constructor if you don't
	//provide any constructor
	public Demo2(int a){
		super();
		System.out.println(a);
	}

	public Demo2(){
		super();
	}

}

/*class Person extends Object{
	String name;
	int age;
}

class Student extends Person{
	float marks;
}*/