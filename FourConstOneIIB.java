package java_Projects;

public class FourConstOneIIB 
{
	FourConstOneIIB()
	{
		System.out.println("I am first Constructor");
	}
	
	FourConstOneIIB(int a)
	{
		System.out.println("I am Second Constructor");
	}
	FourConstOneIIB (String str)
	{
		System.out.println("I am Third Constructor");
	}
	FourConstOneIIB(char b)
	{
	  System.out.println("I am Fourth Constructor");
	}
	
	{
		System.out.println("I am IIB");
	}
	public static void main(String[] args)
	{
		System.out.println("I am Main");
		new FourConstOneIIB();
		new FourConstOneIIB(9);
		new FourConstOneIIB("Test");
		new FourConstOneIIB('s');
		System.out.println("Execution Pattern : Main , IIB and Const 1 , IIB and Cont 2 , IIB and Const 3 , IIb and const 4");

	}

}
