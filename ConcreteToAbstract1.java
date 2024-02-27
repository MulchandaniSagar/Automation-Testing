package java_Projects;

public class ConcreteToAbstract1 extends Abstract12
{

	public static void main(String[] args) 
	{
		ConcreteToAbstract1 c1 = new ConcreteToAbstract1();
		c1.login();
		c1.auth();
		c1.TwoWayAuth();

	}

	
	void login() {
		System.out.println("I am Login from Child class");
		
	}

	
	void auth() {
		System.out.println("I am auth from Child class");
		
	}

	
	void TwoWayAuth() {
		System.out.println("I am TwoWayAuth from Child class");
		
	}

}

abstract class Abstract12
{
	abstract void login();
	
	
	abstract void auth();
	
	
	abstract void TwoWayAuth();
	
}