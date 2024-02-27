package java_Projects;


class GrandParent
{
	void grandMethod()
	{
		System.out.println("Grand Parent Class's Method");
	}
	
}

class Parent extends GrandParent
{
	void parentMethod()
	{
		System.out.println(" Parent Class's Method");
	}
	
}

public class UpAndDownCastProb2 extends Parent
{
	void chidestMethod()
	{
		System.out.println(" Childest Class's Method");
	}

	public static void main(String[] args) {
		
		GrandParent g1 = new UpAndDownCastProb2(); // upcasting
		g1.grandMethod();
		UpAndDownCastProb2 u1 =(UpAndDownCastProb2)g1; //downcasting
		u1.grandMethod();
		u1.chidestMethod();
		u1.parentMethod();		

	}

}
