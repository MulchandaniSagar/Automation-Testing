package java_Projects;

import java.util.Scanner;

public class AreaOfTriangle {
	
	Scanner s1 = new Scanner(System.in);
	float b , h;

	AreaOfTriangle()
	{
		System.out.println("Enter value for Base of a Triangle");
		b = s1.nextFloat();
		System.out.println("Enter value for Height of a Triangle");
		h = s1.nextFloat();
		System.out.println("Area of Triangle is:");
		float Area = 1/2f*b*h;
		System.out.println(Area);
		
	}
	
	public static void main(String[] args)
	{
		new AreaOfTriangle();

	}

}
