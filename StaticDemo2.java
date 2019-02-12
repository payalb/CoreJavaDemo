package demo2;

//static variable
//instance block
//static block
public class StaticDemo2 {
	//Static block is called only once when Class is loaded into the jvm
	static {
		System.out.println("static block called!");
	}
	
	//Instance block is called before the constructor is called
	{
		System.out.println("Instance block invoked!");
	}
	
	StaticDemo2(){
		System.out.println("Construtor called!");
	}
	
	public static void main(String[] args) {
		System.out.println(1);
		StaticDemo2 obj1= new StaticDemo2();
		StaticDemo2 obj2= new StaticDemo2();
	}
}
