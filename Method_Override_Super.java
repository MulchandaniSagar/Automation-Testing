package java_Projects;

import java.util.Scanner;

public class Method_Override_Super extends IamSuper 
{
	void SuperMethod()
	{
		super.SuperMethod();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Text of class MethodOerrideSuper");
		String str = s1.next();
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		
		
		Method_Override_Super m1 = new Method_Override_Super();
		m1.SuperMethod();
		
		
		 
	}

}

class IamSuper
{
	void SuperMethod()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Text");
		String str = s1.next();
		System.out.println(str);
	}
}
