package java_Projects;

import java.util.Date;

public class DateAndSepretations {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		d1.getTime();
		d1.toString();
		System.out.println("Epoch Time : "+ d1.getTime() );
		System.out.println("Current Time (Type 1) : " + d1.toString());
		Date d2 = new Date(d1.getTime());
		String currDate= d2.toString();
		System.out.println("Current Time (Type 2) : "+ currDate);
		String Day = currDate.substring(0, 3);
		System.out.println("Day : "+ currDate.substring(0, 3));
		String Month = currDate.substring(4, 7);
		System.out.println("Month : " + Month);
		String Date = currDate.substring(8, 10);
		System.out.println("Date : " + Date);
		String Time = currDate.substring(11, 19);
		System.out.println("Time : " + Time);
		String CountryCode = currDate.substring(20, 23);
		System.out.println("CountryCode : " + CountryCode);
		String Year = currDate.substring(24, 28);
		System.out.println("Year : " + Year);

	}

}
