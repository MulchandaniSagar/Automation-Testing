package java_Projects;

import java.util.Scanner;

public class Check2Strings_Assignment85 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Strings:");
		String str1 = s1.next();
		String str2 = s1.next();
		
		if(str1.equals(str2))
		{
			System.out.println("Both Strings are Equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

	}

}
