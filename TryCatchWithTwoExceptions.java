package java_Projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchWithTwoExceptions {
	
	void CheckTwoExceptions()
	{
		
		
		try
		{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Write Non Int Value to execute Catch Block , or enter integer value 1");
		int a = s1.nextInt();
		System.out.println("Enter the another Integer Value 2");
		int b = s1.nextInt();
		System.out.println("The Answer is: " + a/b);
		}
		
		catch(InputMismatchException a1)
		{
			System.out.println("You are Writing values apart from Integers");
		}
		
		catch(ArithmeticException e1)
		{
			System.out.println("It is an Arithematic Exception");
		}
		
		
	}

	public static void main(String[] args) {
		
		TryCatchWithTwoExceptions t1 = new TryCatchWithTwoExceptions();
		t1.CheckTwoExceptions();

	}

}
