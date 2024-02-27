package java_Projects;

public class Assign50 extends child1 
{

	public static void main(String[] args) {
		Assign50 a1 = new Assign50();
		a1.childMethod();
		childMethod2();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
			
	}

}

class child1 implements interfaceOne
{

	void childMethod()
	{
		System.out.println("Child method 1 - Non Static");
	}
	
	static void childMethod2()
	{
		System.out.println("Child method 2 - Static");
	}
	
	public void mul() {
		
		System.out.println("Mul");
		
	}

	
	public void div() {
		System.out.println("div");
		
		
	}

	
	public void add() {
		
		System.out.println("add");
		
	}

	
	public void sub() {
		System.out.println("sub");
		
		
	}
	
}

interface interfaceOne extends interfaceTwo
{
	void add();
	void sub();
}

interface interfaceTwo
{
	void mul();
	void div();
	
}