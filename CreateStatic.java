package java_Projects;

public class CreateStatic {
	
	static void add()
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		System.out.println("WAP to create one static method and call inside the main method");
		System.out.println("Addition of 2 numbers by calling static method in Main method");
		add();
		System.out.println("End of Program");
	}

}
