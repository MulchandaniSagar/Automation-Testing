package java_Projects;

public class NonStaticVariablesCalledInStatic
{
	int a;
	int b;
	
	static void add()
	{
		NonStaticVariablesCalledInStatic n1 = new NonStaticVariablesCalledInStatic();
		n1.a = 100;
		n1.b = 100;
		System.out.println(n1.a+n1.b);
		
	}
	
	static void sub()
	{
		NonStaticVariablesCalledInStatic n1 = new NonStaticVariablesCalledInStatic();
		n1.a = 1000;
		n1.b = 100;
		System.out.println(n1.a-n1.b);
	}

	public static void main(String[] args) 
	{
		System.out.println("Program to call non static global variables in Static Method");
		add();
		sub();

	}

}
