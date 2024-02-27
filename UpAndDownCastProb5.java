package java_Projects;

class GrandParet5
{
	void GpMethod5()
	{
		System.out.println("Grand Parent Method");
	}
	
}

class Parent5 extends GrandParet5
{
	void ParMethod()
	{
		System.out.println(" Parent Method");
	}
	
	
}


class elderChild5 extends Parent5
{
	void EldMethod()
	{
		System.out.println("Elder Child Method");
	}
	
	
}

public class UpAndDownCastProb5 extends elderChild5
{
	
	void childestMethod()
	{
		System.out.println("Childest Method");
	}
	

	public static void main(String[] args) {
		
		Parent5 p5 =new elderChild5();
		p5.ParMethod();
		p5.GpMethod5();
		elderChild5 e1 =new UpAndDownCastProb5(); //upcasting to Downcast
		UpAndDownCastProb5 u1 =(UpAndDownCastProb5)e1;
		u1.childestMethod();
		u1.EldMethod();
		u1.ParMethod();
		u1.GpMethod5();
		
	}

}
