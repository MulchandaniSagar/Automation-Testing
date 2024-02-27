package java_Projects;

import java.util.Date;

public class FutureDate {
	
	public static void main(String[] args) {
		
	
		Date d1 = new Date();
		d1.getTime();
		d1.toString();
		Date d2 = new Date(d1.getTime() + (1000*60*60*24*1));
		String FutureDate = d2.toString();
		System.out.println("Future Date: " +FutureDate);
		Date d3 = new Date(d1.getTime() - (1000*60*60*24*1));
		String PastDate = d3.toString();
		System.out.println("Past Date : " +PastDate);
		

	}

}
