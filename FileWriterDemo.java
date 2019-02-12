package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//InputStream, OutputStream, Reader, Writer
//FileInputStream, FileOutputStream, FileReader, FileWriter
//byte (video| image|audio) : char (text)
public class FileWriterDemo {
	public static void main(String[] args){
		try (FileInputStream stream= new FileInputStream(new File("C:\\Users\\payal\\Pictures","image1.jpg"));
			FileOutputStream stream1= new FileOutputStream(new File("C:\\\\Users\\\\payal","image2.jpg"),false);)
					
		{
			long startTime=System.currentTimeMillis();
		int i=stream.read(); // -1 (if end of file)
		while(i != -1) {
			stream1.write(i);
			stream1.write(22);//22?
			
			i= stream.read(); //access denied exception
			
		}
		stream1.flush();
		long endTime=System.currentTimeMillis();
		System.out.println("Time Taken is "+ (endTime-startTime));
		}catch(IOException e) {}
		
	}
}
