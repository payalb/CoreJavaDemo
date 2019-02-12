package day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//Spring, Junit, Eclipse IDE
public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//One obj= new One();
		/*Class obj1=Class.forName("day2.One");*/
		//declared: access modifier will not matter| parent class 
	/*	Constructor c=obj1.getDeclaredConstructor();
		c.setAccessible(true);
		One o=(One) c.newInstance();
		o.print();
		
		obj1.getConstructor();*/
		Class obj1=Class.forName("day2.Two");
		Two towObj=(Two) obj1.getDeclaredConstructor().newInstance();
		//all the methods of this class, access modifier does not matter
		Method method=obj1.getDeclaredMethod("doWork");
		method.setAccessible(true);
		method.invoke(towObj);
		//public methods of this class, parent class
		Method method1=obj1.getMethod("print");
		method1.invoke(towObj);
		
	}
}



class One{
	
	 One() {
		
	}
	public void print() {
		System.out.println("printing");
	}
}
class Two extends One{
	private void doWork() {
		System.out.println("Working!");
	}
}