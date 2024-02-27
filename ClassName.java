package java_Projects;

public class ClassName extends place 
{

	ClassName()
	{
		System.out.println("Name");
	}
	public static void main(String[] args) {
		System.out.println("T,A,P,N");
		new ClassName();
	}

}

class place extends animal
{
	place()
	{
		System.out.println("place");
	}
}

class animal extends thing
{
	animal()
	{
		System.out.println("animal");
	}
}

class thing
{
	thing()
	{
		System.out.println("Thing");
	}
}
