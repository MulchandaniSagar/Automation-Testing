package java_Projects;

public class MathClassAreaOfCircle {
	
	void areaOfCircle()
	{
		double pi = Math.PI;
		double Area;
		
		for (int i = 1 ; i <=10 ; i++)
		{
			Area = pi * (Math.random()) * (Math.random());
			System.out.println(i+"."+"Area of Circle " + i + " is " + Area );
		}
	}

	public static void main(String[] args) {

		MathClassAreaOfCircle m1 = new MathClassAreaOfCircle();
		m1.areaOfCircle();

	}

}
