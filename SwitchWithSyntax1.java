package java_Projects;

import java.util.Scanner;

public class SwitchWithSyntax1 
{

	public static void main(String[] args) 
	{
		System.out.println("Switch case with Syntax 1");
		Scanner s1 = new Scanner(System.in);
		int a =s1.nextInt();
		
		switch(a)
		{
			case 1: System.out.println("Test 1");
			break;
			case 2 : System.out.println("Test 2");
			break;
			case 3 : System.out.println("Test 3");
			break;
			default: System.out.println("Default");
		}		
		
		
			
	}

}
