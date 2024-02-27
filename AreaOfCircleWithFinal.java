package java_Projects;

public class AreaOfCircleWithFinal {

	public static void main(String[] args) 
	{
		AreaOfCircle();

	}
	
	static void AreaOfCircle()
	{
		final double pi = 3.14;
		int r = 10;
		double area;
		area= pi*r*r;
		System.out.println(area);
		
	}
}
