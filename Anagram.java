package java_Projects;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Checking Anagram");
		System.out.println("Enter your First String:");
		String str1 = s1.next();
		System.out.println("Enter your Second String:");
		String str2 = s1.next();
		
		if (str1.length() == str2.length())
		{
				char C1[] = str1.toCharArray();
				char C2[] = str2.toCharArray();
				Arrays.toString(C1);
				Arrays.sort(C1);
				Arrays.toString(C2);
				Arrays.sort(C2);
				String Check1 = Arrays.toString(C1);
				String Check2 = Arrays.toString(C2);
				System.out.println(Check1);
				System.out.println(Check2);
				if (Check1.equals(Check2))
				{
					System.out.println("It is an Anagram");
				}
				else
				{
					System.out.println("It is not an Anagram");
				}	
		}
		else
		{
			System.out.println("It is Not an Anagram");
		}
		

	}

}
