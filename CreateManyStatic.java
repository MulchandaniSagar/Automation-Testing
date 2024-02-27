package java_Projects;

public class CreateManyStatic {
	
	static void add ()
	{ 	int a,b;
		a = 100;
		b = 1000;
		System.out.println(a+b);
		
	}
	
	static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	static void mul (int a , int b)
	{
		System.out.println(a*b);
	}
	
	static void div()
	{
		int a=100;
		int b = 10;
		System.out.println(a/b);
	}

	public static void main(String[] args)
	{
	System.out.println("Create many static method and call inside main method");
	add();
	sub(100,30);
	mul(20,20);
	div();
	}

}
