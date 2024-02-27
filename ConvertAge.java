package java_Projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertAge {

	public static void main(String[] args) {
		
		System.out.println("Convert your Age from byte to Short");
		System.out.println("Widening:");
		
		try {
		
		Scanner s1 = new Scanner(System.in);
		byte b = s1.nextByte();
		short s = (short)b;
		System.out.println(s);           
		}
		catch (InputMismatchException ie)
		{
			System.out.println("The Size is Byte is Out of Bound");
		}
	}

}
