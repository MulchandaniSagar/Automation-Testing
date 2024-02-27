package java_Projects;

public class GlobalStatic_Arithematic {

	static int a;
	 static int b;
	 int c;
	 int d;
	 static GlobalStatic_Arithematic g1 = new GlobalStatic_Arithematic();
	
	static void add()
	{
		a=100;
		b=200;
		System.out.println(a+b);
	}
	
	static void sub()
	{
		a = 1000;
		GlobalStatic_Arithematic g1 = new GlobalStatic_Arithematic();
		g1.c = 500;
		System.out.println(a-g1.c);
		
	}
	
	void mul()
	{
		GlobalStatic_Arithematic g1 = new GlobalStatic_Arithematic();
		g1.c = 100;
		g1.d = 2;
		int mul = g1.c * g1.d;
		System.out.println(mul);
	}
	
	void div()
	{
		b = 2000;
		GlobalStatic_Arithematic g1 = new GlobalStatic_Arithematic();
		g1.c = 100;
		System.out.println(b/g1.c);
	}
	
	public static void main(String[] args)
	{
		add();
		sub();
		//GlobalStatic_Arithematic g1 = new GlobalStatic_Arithematic();
		g1.mul();
		g1.div();
		

	}

}
