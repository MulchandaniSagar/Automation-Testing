package java_Projects;

import java.util.Scanner;

public class LocalScanner {

	static void add()
	{
		int a,b;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Value of a for Addition");
		a =s1.nextInt();
		System.out.println("Enter the Value of b for Addition");
		b= s1.nextInt();
		System.out.println("Addition of a and b is: ");
		System.out.println(a+b);
		
	}
	
	static void sub()
	{
		int a,b;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Value of a for Subtraction");
		a =s1.nextInt();
		System.out.println("Enter the Value of b for Subtraction");
		b= s1.nextInt();
		System.out.println("Subtraction of a and b is: ");
		System.out.println(a-b);
	}
	
	void mul()
	{
		int a,b;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Value of a for Multiplication");
		a =s1.nextInt();
		System.out.println("Enter the Value of b for Multiplication");
		b= s1.nextInt();
		System.out.println("Multiplication of a and b is: ");
		System.out.println(a*b);
	}
	
	void div()
	{
		double a,b;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Value of a for Division");
		a =s1.nextInt();
		System.out.println("Enter the Value of b for Division");
		b= s1.nextInt();
		double ans = a/b;
		System.out.println("Division of a and b is: ");
		System.out.println(ans);
	}
	
	public static void main(String[] args) 
	{
	add();
	sub();
	LocalScanner l1 = new LocalScanner();
	l1.mul();
	l1.div();
	System.out.println("End Of Program");
	}

}
