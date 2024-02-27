package java_Projects;

import java.util.Scanner;

public class ReverseAStrin_Assign82 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter a String to Reverse");
		String str = s1.next();
		
		for (int i=str.length()-1 ; i>=0 ; i--)
		{
			 System.out.print(str.charAt(i));
		}

	}

}
