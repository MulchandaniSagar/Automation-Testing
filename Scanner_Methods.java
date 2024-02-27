package java_Projects;

import java.util.Scanner;

public class Scanner_Methods 
{

	public static void main(String[] args) 
	{
	System.out.println("Program to write all scanner methods");	
	
	Scanner s1 = new Scanner(System.in);

	System.out.println("Enter String");
		String Str = s1.next();
		System.out.println("Enter Int");
		int a = s1.nextInt();
		System.out.println("Enter byte");
		byte b= s1.nextByte();
		System.out.println("Enter short");
		short c= s1.nextShort();
		System.out.println("Enter long");
		long d= s1.nextLong();
		System.out.println("Enter boolean");
		boolean e= s1.nextBoolean();
		System.out.println("Enter double");
		double f= s1.nextDouble();
		System.out.println("Enter float");
		float g= s1.nextFloat();
		System.out.println("End of Program");
	}

}
