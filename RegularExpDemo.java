package day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo {
	public static void main(String[] args) {
		//Pattern, Matcher
		
		Pattern obj=Pattern.compile("\\S");
		Matcher m=obj.matcher("aa");
		boolean matches=m.matches();
		System.out.println(matches);
	}
}
