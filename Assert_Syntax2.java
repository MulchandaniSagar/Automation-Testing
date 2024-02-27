package java_Projects;

import java.util.Scanner;

public class Assert_Syntax2 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Password");
		String password = s1.next();
		assert password.equals("SAGAR123") : "Your Password is Incorrect";
		System.out.println("Your password is Correct");

	}

}
