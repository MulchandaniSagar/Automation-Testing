package java_Projects;

public class ConcreteToAbstract extends Abstract_Class
{

	public static void main(String[] args)
	{
		ConcreteToAbstract c1 = new ConcreteToAbstract();
		c1.auth();
		c1.login();
		c1.TwoWay();

	}

	
	void login() {
		System.out.println("I am Login");	
	}

	
	void auth() {
		System.out.println("I am Auth");	
	}

	
	void TwoWay() {
	System.out.println("I am Two Way");	
	}

}

abstract class Abstract_Class
{
	abstract void login();
	abstract void auth();
	abstract void TwoWay();
	
}