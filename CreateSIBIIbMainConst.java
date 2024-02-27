package java_Projects;

public class CreateSIBIIbMainConst {
	{
		System.out.println("I am IIB");
	}
	
	static
	{
		System.out.println("I am SIB");
	}
	
	CreateSIBIIbMainConst()
	{
		System.out.println("I am Constructor");
	}
	

	public static void main(String[] args) 
	{
		System.out.println("I am Main");
		new CreateSIBIIbMainConst();

	}

}
