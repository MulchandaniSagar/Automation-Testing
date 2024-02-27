package java_Projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertByteToDoubleToInt {

	public static void main(String[] args) {
		
		System.out.println("Convert Byte to Double");
		byte b = 127;
		double d = (double)b;
		System.out.println(d);
		System.out.println("Convert Double to Int");
		int i = (int)d;
		System.out.println(i);
		System.out.println("User Input Way");
		
		Scanner s1 = new Scanner(System.in);
		try {
			System.out.println("Enter Byte Value:");
			byte b1 = s1.nextByte();
			double d1 = b1; //Implicit
			System.out.println(d1);
			int i1 = (int)d1;
			System.out.println(i1);
		}
		
		catch(InputMismatchException i1)
		{
			System.out.println("The Byte Value is Out of it's Range");
		}
		

	}

}
