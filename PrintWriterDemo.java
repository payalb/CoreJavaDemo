package day3;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
//PintWriter
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		try(PrintWriter writer= new PrintWriter(System.out);
			
				){
			
		writer.println(43l);
		writer.print(32);
		writer.println(43.2f);
		writer.println(false);
		writer.flush();
		System.out.println(1);
		Employee e= new Employee();
		e.id=1;
		e.name= "Payal";
		
		writer.print(e);
		}
	}
}
