package java_Projects;

import java.util.Scanner;

public class throwsExample
{
	
	void div() throws ArithmeticException
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a/b);
	}

	public static void main(String[] args)
	{
		throwsExample t1 = new throwsExample();
		t1.div();

	}

}
