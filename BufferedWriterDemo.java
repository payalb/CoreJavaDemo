package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//PintWriter
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(
				new FileReader(new File("C:\\Users\\payal\\Pictures", "abc.txt")));
				BufferedWriter writer= new BufferedWriter(
						new FileWriter(new File("C:\\Users\\payal\\Pictures", "abc1.txt")));) {
			long startTime=System.currentTimeMillis();
			String line = reader.readLine();
			while (line != null) {
				writer.write(line);
			//	writer.newLine();
				line = reader.readLine();
				writer.write(22);
				
			}
			long endTime=System.currentTimeMillis();
			System.out.println("Time taken= "+ (endTime- startTime));
		}
	}
}
