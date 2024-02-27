package java_Projects;

class grandParentPract
{
	void gpPract()
	{
		System.out.println("Grand Parent");
	}
}


class parentPract extends grandParentPract //Upcasted till here  //Downcast from Here
{
	void ParentPractMeth()
	{
		System.out.println("Parent Method");
	}
}

public class UpCastAndDownCastPract extends parentPract // Upcasted From here // Downcast till here
{ 
	void ChildMeth()
	{
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		
		/*
		 * parentPract p1 =new UpCastAndDownCastPract(); p1.ParentPractMeth();
		 * p1.gpPract(); UpCastAndDownCastPract u1 =(UpCastAndDownCastPract) p1;
		 * //Downcast u1.gpPract(); u1.ParentPractMeth(); u1.ChildMeth();
		 */
		parentPract p1 =new UpCastAndDownCastPract();
		p1.ParentPractMeth();
		UpCastAndDownCastPract u1 =(UpCastAndDownCastPract) p1;
		u1.gpPract();
		u1.ParentPractMeth();
		u1.ChildMeth();
		
		
		
		grandParentPract g1 = new parentPract();
		g1.gpPract();
		//parentPract p1 =(parentPract)g1;
		p1.gpPract();
		p1.ParentPractMeth();
		

	}

}
