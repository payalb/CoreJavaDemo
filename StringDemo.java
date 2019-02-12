package day2;

public class StringDemo {
public static void main(String[] args) {
	String str= "Hello"; //String Literal
	String str1= new String("Hello"); // Object
	String str2= "Hello";
	String str3= new String("Hello"); 
	// == : 2 references whether they are pointing to same object
	System.out.println(str==str1); //false
	System.out.println(str.equals(str1)); //true
	System.out.println(str==str2); //true
	System.out.println(str.equals(str2)); //true
	System.out.println(str3==str1); //false
	System.out.println(str3.equals(str1)); //true
	
	
	
}
}
