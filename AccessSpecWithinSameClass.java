package java_Projects;

public class AccessSpecWithinSameClass {

	public static void main(String[] args) {
		
		AccessSpecWithinSameClass a1 = new AccessSpecWithinSameClass();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();

	}
	
	public void add()
	{
		System.out.println("I am Add");
	}
	
	private void sub()
	{
		System.out.println("I am Sub");
	}
	
	protected void mul()
	{
		System.out.println("I am Mul");
	}

	void div()
	{
		System.out.println("I am Div");
	}
}
