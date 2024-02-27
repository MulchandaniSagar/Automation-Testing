package java_Projects;

public class CreateFewConst
{
	CreateFewConst()
	{
		System.out.println("Constructor one is called");
	}
	
	CreateFewConst(String str1)
	{
		System.out.println(str1);
	}
	
	CreateFewConst(String str2 , String str21)
	{
		System.out.println(str2);
		System.out.println(str21);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Create Few constructor and call in main method");
		new CreateFewConst();
		new CreateFewConst("Constructor two is called");
		new CreateFewConst("Constructor three is called", "with 2 parameters");
	}
	
	
}
