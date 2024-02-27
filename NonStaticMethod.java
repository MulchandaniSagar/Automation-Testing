package java_Projects;

public class NonStaticMethod 
{
	
	void add()
	{
		int a = 101;
		int b = 9;
		System.out.println(a+b);
	}
	
	void sub()
	{
		int a = 101;
		int b = 9;
		System.out.println(a-b);
	}
	
	void mul()
	{
		int a = 101;
		int b = 9;
		System.out.println(a*b);
	}
	
	void div()
	{
		int a = 90;
		int b = 9;
		System.out.println(a/b);
	}

	public static void main(String[] args)
	{
		System.out.println("Calling a non static method insde main method by creating an object through it's reference variable");
		NonStaticMethod n1 = new NonStaticMethod();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();

	}



}
