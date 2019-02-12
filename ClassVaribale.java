package demo2;

public class ClassVaribale {
	
	static int x; //Variable belongs to a class. Initialized by default
	
	
}


class Demo1{
	
	public static void main(String[] args) { //main thread
		
	//	Class c1=Demo1.class; //metadata about the class 
		
		//Since it belongs to a class, i can access it directly using a class reference
		System.out.println(ClassVaribale.x); //0
		
		ClassVaribale obj= new ClassVaribale();
		System.out.println(obj.x); // 0
		obj.x= 20;
		
		System.out.println(ClassVaribale.x); //20
		
		ClassVaribale obj1= new ClassVaribale();
		System.out.println(obj1.x); //20
		obj1.x++;
		System.out.println(obj.x); //21
		
		obj.x++;
		System.out.println(ClassVaribale.x); //22
	}
}
//loading a class?