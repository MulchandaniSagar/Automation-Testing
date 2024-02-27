package java_Projects;

import java.util.Scanner;

public class SwitchWithArithematicOperations {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 1 to perform All operations");
		int a = s1.nextInt();
		switch(a)
		{
		case 1 : System.out.println("Addition of 2 numbers");
				 int b,c;
				 System.out.println("Enter Value of num 1");
				 b= s1.nextInt();
				 System.out.println("Enter value of num 2");
				 c = s1.nextInt();
				 System.out.println("Sum is");
				 System.out.println(b+c);
				 
		case 2 : System.out.println("Subtraction of 2 numbers");
		 
		 System.out.println("Enter Value of num 1");
		 b= s1.nextInt();
		 System.out.println("Enter value of num 2");
		 c = s1.nextInt();
		 System.out.println("Sub is");
		 System.out.println(b-c);
		 
		case 3 : System.out.println("Multiplication of 2 numbers");
		 
		 System.out.println("Enter Value of num 1");
		 b= s1.nextInt();
		 System.out.println("Enter value of num 2");
		 c = s1.nextInt();
		 System.out.println("Mul is");
		 System.out.println(b*c);
		 
		case 4 : System.out.println("Division of 2 numbers");
		 
		 System.out.println("Enter Value of num 1");
		 b= s1.nextInt();
		 System.out.println("Enter value of num 2");
		 c = s1.nextInt();
		 System.out.println("Div is");
		 System.out.println(b/c);
		 
		 default: System.out.println("I am default");
		}

	}

}
