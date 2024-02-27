package java_Projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertIntToDoubleAndDoubleToByte {

	public static void main(String[] args) {
		
		System.out.println("Convert int to Double");
		int i = 99;
		System.out.println("Int is " + i);
		double d = i; //Implicit
		System.out.println("Double is " + d);
		byte b = (byte)d; //Explicit
		System.out.println("Byte is " +b);
		
		Scanner s1 = new Scanner(System.in);
		try {
			System.out.println("Enter Int Value:");
			int i1 =  s1.nextInt();
			System.out.println("Int is " +i1);
			double d1 = i1;
			System.out.println("Double is" + d1);
			byte b1 = (byte)d1;
			System.out.println("byte is " + b1);
			}
		
		catch(InputMismatchException i1)
		{
			System.out.println("The Byte Value is Out of it's Range");
		}
		

	}

}
