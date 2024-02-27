package java_Projects;

import java.util.Scanner;

public class Method_Override extends Override 
{

	void add(int a)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter num 1");
		int num1 = s1.nextInt();
		System.out.println("Enter num 2");
		int num2 = s1.nextInt();
		System.out.println("The Sum of 2 numbers are:");
		System.out.println(num1+num2);
	}
	
	
	public static void main(String[] args) 
	{
		Method_Override m1 = new Method_Override();
		m1.add(10);
		
	}

}

class Override
{
	void add(int a)
	{
		Scanner s1 = new Scanner(System.in);
		int num1 = 100;
		int num2 = 1;
		System.out.println(num1+num2);
	}
	
	
}
