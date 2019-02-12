package demo2;

public class StaticMethodDemo {
	
	int x = 2;
	public static void main(String[] args) {
		StaticMethodDemo obj1= new StaticMethodDemo();
		obj1.x= 5;
		StaticMethodDemo obj2= new StaticMethodDemo();
		obj2.x= 22;
		StaticMethodDemo.add(3, 4); //7
		StaticMethodDemo.add(31, 4); //35
	}
	
	static void add(int a, int b) {
		System.out.println(a+b);
	}
}
