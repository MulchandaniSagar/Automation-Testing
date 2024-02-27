package java_Projects;

import java.util.Scanner;

public class ReturnType_UserInput {
	
	int add(int a , int b)
	{
		int sum = a+b;
		return sum;
	}
	
	double sub(double a , double b)
	{
		double sub = a-b;
		return sub;
		
	}
	
	float mul(float a , float b)
	{
		float mul =  a*b;
		return mul;
	}
	
	String YourName(String str)
	{
		String str2 = str;
		return str2;
	}
	
	boolean BooleanChecker(int no)
	{
		if(no>0)
		{
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
	
		ReturnType_UserInput r1 = new ReturnType_UserInput();
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 2 int numbers to Add");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println("Addition is : "+r1.add(a, b));
		System.out.println("Enter 2 Double numbers to Sub");
		double c = s1.nextDouble();
		double d = s1.nextDouble();
		System.out.println("Subtraction is : "+r1.sub(c, d));
		System.out.println("Enter 2 Float numbers to Mul");
		float e = s1.nextFloat();
		float f = s1.nextFloat();
		System.out.println("Multiplication is : " + r1.mul(e, f));
		System.out.println("Enter String");
		String str = s1.next();
		System.out.println("The String You Passed is : "+r1.YourName(str));
		System.out.println("If you enter no>0 , you will get True else False");
		int no = s1.nextInt();
		System.out.println(r1.BooleanChecker(no));
		

		
		
		

	}

}
