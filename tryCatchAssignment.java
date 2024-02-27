package java_Projects;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchAssignment {

	public static void main(String[] args) {
		
		try {
		Scanner s1 = new Scanner(System.in);
		int a = 1/0;
		int b = s1.nextInt();
		int c = s1.nextInt();
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Arithematic");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("Input Mismatch");
		}
		}

}
