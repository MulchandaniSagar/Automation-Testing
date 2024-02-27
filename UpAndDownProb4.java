package java_Projects;

class GrandParent4
{
	void gpMethod()
	{
		System.out.println("Grand Parent Method");
	}
}


class Parent4 extends GrandParent4
{
	void parMethod()
	{
		System.out.println("Parent Method");
	}
}

class ElderChild extends Parent4
{
	void elderMethod()
	{
		System.out.println("Elder Method");
	}
}

public class UpAndDownProb4 extends ElderChild
{
	
	void childMeth()
	{
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		Parent4 p1 =new ElderChild(); //Upcasting
		p1.parMethod();
		p1.gpMethod();
		ElderChild e1 =(ElderChild)p1; //Downcasting
		e1.gpMethod();
		e1.parMethod();
		e1.elderMethod();
		
	}

}
