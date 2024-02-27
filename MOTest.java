package java_Projects;


class MOParent
{
	 MOParent(String str) // parameters and Returntype
	{
		System.out.println("Parent");
	}
	 
	 void test()
	 {
		 System.out.println("Test");
	 }
}

public class MOTest extends MOParent
{
	 MOTest(int a)
	{
		 super("Sagar");
		System.out.println("Execute1");
		
	}
	 MOTest(String Str , int b)
		{
		 	this(10);
			System.out.println("Execute2");
			
			
		}
		 
	 
	 
	

	public static void main(String[] args) {
		
		/*
		 * MOTest m1 = new MOTest(); // not allowing to create an object of class w/o
		 * constructor's parameters m1.add();
		 */
		new MOTest("Sagar" , 10);
	}

}
