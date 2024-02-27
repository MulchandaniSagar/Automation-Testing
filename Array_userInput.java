package java_Projects;

import java.util.Scanner;

public class Array_userInput {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Length to which you want to take an Input");
		int Size = s1.nextInt();
		String Str[] = new String[Size];
		System.out.println("Enter the String of Size: " + Size);
		for (int i = 0 ; i <Size ; i++)
		{
			Str[i] = s1.next();
		}
		
		System.out.println("The Strings are as follows");
		for (int j = 0 ; j <Size ; j++)
		{
			 System.out.print(Str[j] + " ");
		}
		
	}

}
