package java_Projects;

public class AreaOfCircleWith2Methods {
	
	static final double pi = 3.14;
	
	static void AreaOfCirle1()
	{
		double r = 7;
		System.out.println(pi*r*r);
	}
	
	void AreaOfCircle2()
	{
		AreaOfCircleWith2Methods a1 = new AreaOfCircleWith2Methods();
		double r = 14;
		System.out.println(a1.pi *r*r);
	}
	

	public static void main(String[] args)
	{
		AreaOfCirle1();
		AreaOfCircleWith2Methods a1 = new AreaOfCircleWith2Methods();
		a1.AreaOfCircle2();
	}

}
