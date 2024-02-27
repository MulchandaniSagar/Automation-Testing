package java_Projects;

public class Son extends father
{

	public static void main(String[] args) {

		System.out.println("Main Method - Son ");
		fatherr();
		dau d1 = new dau();
		d1.dau();
	

	}

}

class dau extends father
{
	 void dau()
	{
	System.out.println(" Method - daughter ");
	}
}

class father
{
	static void fatherr()
	{
	System.out.println(" Method - Father ");
	}
}
