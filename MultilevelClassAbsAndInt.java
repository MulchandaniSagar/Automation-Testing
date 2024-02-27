package java_Projects;

public class MultilevelClassAbsAndInt extends ClassOne1
{
	MultilevelClassAbsAndInt()
	{
		System.out.println("One");
	}
	
	public static void main(String[] args)
	{
		MultilevelClassAbsAndInt m1 = new MultilevelClassAbsAndInt();
		m1.MethodTwo();
		m1.Method_Three();
		m1.MethodFour();

	}

	
	public void Method_Three() {
		System.out.println("Three");
		
	}

	
	public void MethodFour() {
		System.out.println("Four");
		
	}

	
	void MethodTwo() {
		System.out.println("Two");
		
	}

}

abstract class ClassOne1 implements  interface_One
{
	abstract void MethodTwo();
}

interface interface_One extends interface_Two
{
	void Method_Three();
}

interface interface_Two
{
	void MethodFour();
}