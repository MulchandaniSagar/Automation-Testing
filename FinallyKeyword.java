package java_Projects;

import java.util.Scanner;

public class FinallyKeyword {
	
	void CheckFinally()
	{
		try
		{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a/b);
				
		}
		catch (ArithmeticException e1)
		{
			System.out.println("I am AE");
		}
		finally
		{
			System.out.println("Irrespective I will be Executed");
		}
		
		
		
	}

	public static void main(String[] args) {
		FinallyKeyword f1 = new FinallyKeyword();
		f1.CheckFinally();

	}

}
