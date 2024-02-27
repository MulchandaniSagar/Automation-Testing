package java_Projects;

import java.util.Scanner;

public class GLobal_Scanner 
{
	 int a,b;
	 Scanner s1 = new Scanner(System.in);
	 
	
	void add()
	{	System.out.println("Enter the value of A");
		a = s1.nextInt();
		System.out.println("Enter the value of B");
		b= s1.nextInt();
		System.out.println("Sum of A and B is:");
		System.out.println(a+b);
	}
	
	void sub()
	{
		System.out.println("Enter the value of A");
		a = s1.nextInt();
		System.out.println("Enter the value of B");
		b= s1.nextInt();
		System.out.println("Sub of A and B is:");
		System.out.println(a-b);
		
	}
	
	 void mul()
	{
		System.out.println("Enter the value of A");
		a = s1.nextInt();
		System.out.println("Enter the value of B");
		b= s1.nextInt();
		System.out.println("Mul of A and B is:");
		System.out.println(a*b);
	}
	
	 void div()
	{
		 	System.out.println("Enter the value of A");
			a = s1.nextInt();
			System.out.println("Enter the value of B");
			b= s1.nextInt();
			System.out.println("Div of A and B is:");
			System.out.println(a/b);
		
	}
	 
	/*
	 * static void test() { GLobal_Scanner g1 = new GLobal_Scanner(); g1.a =
	 * s1.nextInt();
	 * 
	 * }
	 */
	
public static void main(String[] args) 
	{
	System.out.println("Program to do Arithematic Operations with one scanner and global variables");
	GLobal_Scanner g1 = new GLobal_Scanner();
	g1.add();
	g1.sub();
	g1.mul();
	g1.div();
	System.out.println("End of program");
	}

}
