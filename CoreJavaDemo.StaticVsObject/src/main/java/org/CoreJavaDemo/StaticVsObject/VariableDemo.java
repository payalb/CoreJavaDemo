package org.CoreJavaDemo.StaticVsObject;

public class VariableDemo {

	int x; //Instance variable property:belongs to object of the class
	static int z; //Class : This variable will be shared among all objects of the class
	public static void main(String[] args) {
		int y; //Local variable, scope is a block/ method
		
	}
	{
		int z;
		System.out.println(y); //y has a local variable scope, so cannot be accessed in another block/method
	}
}
