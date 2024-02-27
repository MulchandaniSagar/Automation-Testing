package java_Projects;

public class MultiLevelConcrete_Abstract_Concrete extends AbstractClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("I am Main");
		MultiLevelConcrete_Abstract_Concrete m1 = new MultiLevelConcrete_Abstract_Concrete();
		m1.Square();
		SquareRoot();
		m1.mul();
		m1.div();
		m1.add();
		sub();

	}

	void Square()
	{
		System.out.println("I am Square");
		
	}
	
	static void SquareRoot()
	{
		System.out.println("I am Square Root");
	}
	
	void mul() 
	{
		System.out.println("I am Mul");
		
	}


	void div()
	{
		
		System.out.println("I am Div");
	}
	
	void add()
	{
		super.add();
		System.out.println("I am Add");
	}
	
	static void sub()
	{
		System.out.println("I am Sub");
	}

}

abstract class AbstractClass1 extends Concrete1
{
	abstract void mul();
	abstract void div();
}

class Concrete1
{
	void add()
	{
		System.out.println("I am Add From Another class");
	}
	
	static void sub()
	{
		System.out.println("I am Sub From Another class");
	}
	
}