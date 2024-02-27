package java_Projects;

import java.util.Scanner;

public class SwitchFromScanner {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value to check Switch");
		int a = s1.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("Case 1 Executed");
		break;
		case 2: System.out.println("Case 2 Executed");
		break;
		case 3: System.out.println("Case 3 Executed");
		break;
		case 4: System.out.println("Case 4 Executed");
		break;
		default: System.out.println("I am Default");
		}
		

	}

}
