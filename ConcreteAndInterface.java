package java_Projects;

public class ConcreteAndInterface implements Interface1
{

	public static void main(String[] args) {
		ConcreteAndInterface c1 = new ConcreteAndInterface();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();

	}


	public void add() {
		System.out.println("I am add");
		
	}

	
	public void sub() {
		System.out.println("I am sub");
		
	}

	
	public void mul() {
		System.out.println("I am mul");
		
	}

	
	public void div() {
		System.out.println("I am div");
		
	}

}

interface Interface1 extends Interface2
{
	void mul();
	void div();
	
}

interface Interface2
{
	void add();
	void sub();
	
}