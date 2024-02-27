package java_Projects;

public class ThisCallingStatement {
	
	ThisCallingStatement()
	{
		this("Sagar");
		System.out.println("3");
	}
	
	ThisCallingStatement(String Str)
	{
		this(10);
		System.out.println("2");
	}
	
	ThisCallingStatement(int i)
	{
		System.out.println("1");
	}

	public static void main(String[] args) {
		new ThisCallingStatement();

	}

}
