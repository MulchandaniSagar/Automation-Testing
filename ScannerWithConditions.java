package java_Projects;

import java.util.Scanner;

public class ScannerWithConditions {

	public static void main(String[] args) 
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter your age");
	int age = s1.nextInt();
	
	if (age>=18)
	{
		System.out.println("I am an Adult");
	}
	else
	{
		System.out.println("I am Young");
	}
	
	}

}
