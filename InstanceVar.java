package demo2;

public class InstanceVar {

	int variableOne; //instance variable/ object
}

class Demo{
	//main thread
	public static void main(String[] args) {
		InstanceVar obj1= new InstanceVar();
		obj1.variableOne= 10;
		
		InstanceVar obj2= new InstanceVar();
		System.out.println(obj2.variableOne); //0
		obj2.variableOne=20;
		
		System.out.println(obj1.variableOne);//10
		System.out.println(obj2.variableOne); //20
	}
}