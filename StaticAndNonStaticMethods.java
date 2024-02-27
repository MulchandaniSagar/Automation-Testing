package java_Projects;

public class StaticAndNonStaticMethods {
	
	static void add()
	{
		int a = 100;
		int b = 200;
		int add = a+b;
		System.out.println(add);
	}
	
	static void sub()
	{
		int a = 100;
		int b = 200;
		System.out.println(a-b);
	}
	
	void mul()
	{
		int a = 100;
		int b = 200;
		int mul;
		mul = a*b;
		System.out.println(mul);
	}
	
	void div()
	{
		float a = 100;
		float b = 200;
		float d = a/b;
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
	
	System.out.println("To Add and Sub in Static Method");
	System.out.println("To Multiply and Div in Non Static Method");
	System.out.println("Calling Static Method by it's Name");
	add();
	sub();
	System.out.println("Calling Non Static method by creating an object and reference variable");
	StaticAndNonStaticMethods a2 = new StaticAndNonStaticMethods();
	a2.mul();
	a2.div();
	System.out.println("End of Assignment 2");

	}

}
