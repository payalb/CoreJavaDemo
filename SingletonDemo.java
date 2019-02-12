package com.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		A obj = A.getInstance();
		try (ObjectOutputStream s2 = new ObjectOutputStream(new FileOutputStream("abc.txt"));
				ObjectInputStream s1 = new ObjectInputStream(new FileInputStream("abc.txt"));) {
			s2.writeObject(obj);
			A obj1 = (A) s1.readObject();
			System.out.println(obj == obj1);
		}
	}
}
//During deserialization, it tries to find out the parent class of this class 
//which does not implement serializable
//THen it creates object of that class and populates value into it. Object o= new Object();
/*class B extends A{} */
class A implements Serializable, Cloneable{

	private A() {
	}

	static final int maxValue = 74364;
	static A a = new A();

	public static A getInstance() {
		return a;
	}
	
	 Object readResolve()
    		throws ObjectStreamException{
		return a;
	}
	 @Override
	 public A clone() {
		 return a;
	 }
}