package com.java;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner("apple, banana, pear, mango");
		sc.useDelimiter(", ");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
}
