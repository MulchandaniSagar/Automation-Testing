package java_Projects;

import java.util.Scanner;

public class Palindrome_Assignment83 {

	public static void main(String[] args) {
		
		System.out.println("Check 2 Strings are palindrome");
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Your String to Check");
		String str = s1.next();
		String Reverse = "";
		
		for (int i = str.length()-1 ; i>=0 ; i--)
		{
			Reverse = Reverse + str.charAt(i);
		}
		
		System.out.println("Reverse of String is " + Reverse);
		
		if (str.equals(Reverse))
		{
			System.out.println("It Is a Palindrome");
		}
		else 
		{
			System.out.println("It is not a Palindrome");
		}

	}

}
