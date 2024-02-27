package java_Projects;

public class FiveMethodsWithSameName {
	
	static void Asign(int a)
	{
		System.out.println(a);
	}
	
	static void Asign(double b)
	{
		System.out.println(b);
	}
	
	static void Asign(char a)
	{
		System.out.println(a);
	}
	
	 void Asign(boolean a)
	{
		System.out.println(a);
	}
	
	 void Asign(String a)
	{
		System.out.println(a);
	}
	
	

	public static void main(String[] args) 
	{
		System.out.println("Prpgram to Write 5 methods with same name with static and non static and different Data type");
		System.out.println("Static methods are called by it's name");
		Asign(10);
		Asign(23.5);
		Asign('b');
		System.out.println("Non Static Methods are called by Creating reference");
		FiveMethodsWithSameName a1 = new FiveMethodsWithSameName();
		a1.Asign(true);
		a1.Asign("Assignment 3");
		System.out.println("End of Assignment 3");
		
	}

}
