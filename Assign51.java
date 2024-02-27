package java_Projects;

public class Assign51 extends AbstractConcrete
{

	public static void main(String[] args) {
		Assign51 a1 = new Assign51();
		a1.AbstractMethod();
		a1.interfaceMethod();
		a1.ConcreteMethod();

	}

	
	void AbstractMethod() {
		System.out.println("Abstract Method's Method");
		
	}


	public void interfaceMethod() {
		System.out.println("I am From Interface");
		
	}

}

abstract class AbstractConcrete implements interface21
{
	abstract void AbstractMethod();
	
	void ConcreteMethod()
	{
		System.out.println("I am concrete in Abstract class");
	}
}

interface interface21
{
	void interfaceMethod();
}
