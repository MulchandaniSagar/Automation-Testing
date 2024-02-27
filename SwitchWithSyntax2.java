package java_Projects;

import java.util.Scanner;

public class SwitchWithSyntax2 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a = s1.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("Case1");
		break;
		case 2: System.out.println("Case 2");
		break;
		}

	}

}
