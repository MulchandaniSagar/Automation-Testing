package java_Projects;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		System.out.println("Reverse a String");
		System.out.println("Enter the String you wish to reverse");
		Scanner s1 = new Scanner(System.in);
		String str = s1.next();
		String Reverse = "";
		
		for (int i=str.length()-1 ; i>=0 ; i-- )
		{
			//str.toCharArray();
			//System.out.print(str.charAt(i));
			Reverse = Reverse + str.charAt(i);
		}
		System.out.println(Reverse);
		
		
		

	}

}
