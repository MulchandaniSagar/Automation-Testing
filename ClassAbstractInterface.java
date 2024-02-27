package java_Projects;

public class ClassAbstractInterface extends Abstract121
{

	public static void main(String[] args) {
		System.out.println("Only uninplimented method will be created here:");
		ClassAbstractInterface c1 = new ClassAbstractInterface();
		c1.mul();
		c1.div();
		c1.add();
		c1.sub();
	}

	
	public void mul() {
		System.out.println("I am Mul");
		
	}

	
	public void div() {
		System.out.println("I am div");
		
	}

	
	void add() {
		System.out.println("I am add");
		
	}

}

abstract class Abstract121 implements Interface12
{
	abstract void add();
	 void sub()
	 {
		 System.out.println("I am sub");
	 }
}

interface Interface12
{
	void mul();
	void div();
}