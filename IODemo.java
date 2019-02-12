package day3;

import java.io.File;
import java.io.IOException;

//java.io
public class IODemo {
	public static void main(String[] args) throws IOException {
		File file= new File("abc.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		File file1= new File("proj1");
		if(!file1.exists()) {
			file1.mkdir();
		}
		
		File file2= new File("C:\\Users\\payal\\Documents\\java","abc.txt");
		if(!file2.exists()) {
			file2.createNewFile();
		}
		file2.delete();
		
		
	}
}
