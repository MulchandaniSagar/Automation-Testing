package java_Projects;


class GrandParent2 
{
	void grandParentMethod()
	{
		System.out.println("Grand Parent Method");
	}
	
}

class Parent2 extends GrandParent2
{
	void parentMethod()
	{
		System.out.println(" Parent Method");
	}
	
}

public class UpAndDownCastProb3 extends Parent2
{
	
	void childestMethod()
	{
		System.out.println(" Childest Method");
	}

	public static void main(String[] args) {
		Parent2 p1 =new UpAndDownCastProb3();
		p1.parentMethod();
		p1.grandParentMethod();
		UpAndDownCastProb3 u1 =(UpAndDownCastProb3)p1; //downcasting
		u1.parentMethod();
		u1.childestMethod();
		u1.grandParentMethod();
	
	
		

	}

}
