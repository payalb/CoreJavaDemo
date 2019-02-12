package day3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateDemo {
 public static void main(String[] args) {
	/*Date date= new Date();
	Calendar */
	 
	 //java.time package:
	 //immutable
	 LocalDate date= LocalDate.now();
	 LocalDate obj= LocalDate.of(2017, 11, 21);//days??
	 date.plusDays(3);
	 System.out.println(date);
	 date= date.plusDays(3);
	 System.out.println(date);
	 System.out.println(date.isAfter(obj));
	 date=date.withDayOfMonth(3);
	 date=date.withYear(2019);
	 
	 
	 LocalTime time= LocalTime.of(2, 20); //2: 20 min
	 //23 hrs 30 mins
	 time=time.plus(23, ChronoUnit.HOURS).plus(30, ChronoUnit.MINUTES);
	
	 LocalDateTime dtObj= LocalDateTime.now();
	 
	 ZonedDateTime zdtObj= ZonedDateTime.now(ZoneId.of("Europe/Paris"));
	 System.out.println(zdtObj);
	 
	Period p= obj.until(date);
	System.out.println(p);
	long days=p.get(ChronoUnit.DAYS);
	System.out.println(days);
	
	 // String: LocalDate
	String sdate=date.toString();
	String str1= "2018-12-23";
	LocalDate dateObj=LocalDate.parse(str1);
	
	// 12/12/2018
	
	String str2= "12/12/2018";
	DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate dateObj1=LocalDate.parse(str2, formatter);
	System.out.println(dateObj1.getDayOfYear());
	
	
	String dateObj2=dateObj1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
	System.out.println(dateObj2);
}
}
