package java_Projects;

public class ThreeMethodsAndGlobalVariable 
{
	static int a , b;
	
	static void add()
	{
		a = 100;
		b = 1000;
		System.out.println(a+b);
	}
	
	static void sub()
	{
		a=1000;
		b = 100;
		System.out.println(a-b);
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Program to write 3 methods and global variable initialization in those methods");
		add();
		sub();

	}

}
