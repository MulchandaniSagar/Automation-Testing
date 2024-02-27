package java_Projects;

public class SuperCallingStatement1 extends ParentClass
{
	
	SuperCallingStatement1()
	{
		System.out.println("I am from child Class");
	}

	public static void main(String[] args) {
		
		new SuperCallingStatement1();
	}

}

class ParentClass
{
	ParentClass()
	{
		System.out.println("I am a method from Parent class");
	}
}
