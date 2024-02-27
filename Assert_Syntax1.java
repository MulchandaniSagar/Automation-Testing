package java_Projects;

import java.util.Scanner;

public class Assert_Syntax1 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the usrname (Length has to be greater 6)");
		String usrname = s1.next();
		assert usrname.length()>6;
		System.out.println("Your Length of usrname is Correct");
	
	}

}
