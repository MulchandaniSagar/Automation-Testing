package java_Projects;

public class ArithematicOperations 
{
	public static void add()
	{
		int a = 100;
		int b = 500;
		int add;
		add = a+b;
		System.out.println(add);
		
	}
	
	public static void sub()
	{
		int a = 100;
		int b = 500;
		int sub = b-a;
		System.out.println(sub);
		
	}
	public static void mul()
	{
		int a = 100;
		int b = 500;
		int mul = a*b;
		System.out.println(mul);
	}
	public static void div()
	{
		int a = 100;
		int b = 500;
		int div = b/a;
		System.out.println(div);
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("A program to ADD , SUB , MUL , DIV : ");
		add();
		sub();
		mul();
		div();
		System.out.println("End of Assignment 1");
	}


}
