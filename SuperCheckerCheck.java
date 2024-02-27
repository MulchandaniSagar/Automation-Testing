package java_Projects;

class parentCher2
{
	void add(int a)
	{
		System.out.println("Parent");
	}
}

public class SuperCheckerCheck extends parentCher2
{
	
	void add(int a)
	{
		super.add(10);
		System.out.println("Child");
	}

	public static void main(String[] args) {
		
	}

}
