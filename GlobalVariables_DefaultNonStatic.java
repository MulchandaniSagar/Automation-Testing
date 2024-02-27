package java_Projects;

public class GlobalVariables_DefaultNonStatic 
{
	
	int a;
	String s;
	boolean b;
	char c;
	float f;
	double d;
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("The Star of Main Method");
		GlobalVariables_DefaultNonStatic g1 = new GlobalVariables_DefaultNonStatic();
		g1.Check_DefaultValues();
	}
	
	void Check_DefaultValues()
	{
		GlobalVariables_DefaultNonStatic g1 = new GlobalVariables_DefaultNonStatic();
		System.out.println(g1.a);
		System.out.println(g1.b);
		System.out.println(g1.d);
		System.out.println(g1.f);
		System.out.println(g1.s);
		System.out.println(g1.c);
	
	}
	
	
	
	
	
	
}
