package java_Projects;

public class SixIffBlocks 
{


	public static void main(String[] args)
	{
		System.out.println("Multiple if blocks");
		Multiple_If_Blocks();

	}
	
	static void Multiple_If_Blocks()
	{
		System.out.println("Start if Multiple if Blocks");
		int a = 100;
		int b = 50;
		System.out.println("The Value of A is 100");
		System.out.println("The Value of B is 50");
		
		if (a>b)
		{
			System.out.println("A is greater than B");
		}
		
		if (a<b)
		{
			System.out.println("A is less than B");
		}
		
		if (a<=b)
		{
			System.out.println("A is less than or Equal to B");
		}
		
		if (a>=b)
		{
			System.out.println("A is greater than or Equal to B");
		}
		
		if (a==b)
		{
			System.out.println("A is Equal to B");
		}
	}


}
