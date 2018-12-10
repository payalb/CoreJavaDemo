package org.CoreJavaDemo.StaticVsObject;

public class VariableDemo2 {

	int x; 
	static int z; 
	public static void main(String[] args) {
		int y; //Local variables are not initialized by default
		y++; //local variables should be initialized before they are used
		System.out.println(z);
		System.out.println(x); 
		//You cannot access a non-static member inside a static block
	}
	{
		System.out.println(x);
		int z;
		System.out.println(z);
	}
}
