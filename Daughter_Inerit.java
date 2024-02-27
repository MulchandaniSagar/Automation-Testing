package java_Projects;

public class Daughter_Inerit extends Father_Inherit
{
	
	void daughter()
	{
		System.out.println("I am Daughter");
	}

	public static void main(String[] args) {
		Daughter_Inerit d1 = new Daughter_Inerit();
		d1.father();
		Son_Inherit s1 = new Son_Inherit();
		s1.son();
		d1.daughter();

	}

}

