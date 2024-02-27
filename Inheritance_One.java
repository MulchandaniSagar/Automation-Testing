package java_Projects;

import java.util.Scanner;

public class Inheritance_One extends two
{

	public static void main(String[] args) {
		
		mul();
		add();
		sub();

	}
	
	static void mul()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Multiplication");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a*b);
	}

}

class two extends three
{
	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Add from Class Two");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a+b);
	}
	
}

class three
{
	static void sub()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Sub from Class Three");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a-b);
		
	}
}