package org.CoreJavaDemo.StaticVsObject;

import com.java.dto.Person;

/**
 * Hello world!
 *
 */
public class App 
{
	int count;
    public static void main( String[] args )
    {
    	Person p= new Person(); //instance / object of Person class
    	p.setId(43);	
    	p.setName("Payal"); 
    }
}
