package java_Projects;

import java.util.Scanner;

public class Interitance_one_NonStatic extends two2
{

	public static void main(String[] args) {
		Interitance_one_NonStatic i1 = new Interitance_one_NonStatic();
		i1.add();
		i1.sub();
		i1.mul();
		
		

	}
	 void mul()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Multiplication");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a*b);
	}

}

class two2 extends three3
{
	 void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Add from Class Two");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a+b);
	}
	
}

class three3
{
	 void sub()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Sub from Class Three");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a-b);
		
	}


}
