package java_Projects;

public class Assign48 extends ClassAbs
{
	
	static void Test1()
	{
		System.out.println("Test1");
	}
	
	void Test2()
	{
		System.out.println("Test2");
	}
	
	
	public static void main(String[] args) {
		ClassConctrete c1 = new ClassConctrete();
		Assign48 a1 = new Assign48();
		a1.div();
		a1.mul();
		c1.add();
		c1.sub();
		Test1();
		a1.Test2();
		
		
		
	}


	void mul() {
		System.out.println("Mul Over-ridden");
		
	}

	void div() {
		System.out.println("Div Over-ridden");
		
	}

}

abstract class ClassAbs
{
	abstract void mul();
	abstract void div();
}

class ClassConctrete
{
	static void add()
	{
		System.out.println("add");
	}
	
	void sub()
	{
		System.out.println("sub");
	}

	
}