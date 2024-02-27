package java_Projects;

import java.util.Scanner;

public class throwExcptionIfBelow18 {
	
	void checkAge()
	{
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		if(age>18)
		{
			System.out.println("you are allowed to search on Google");
		}
		else
		{
			throw new ArithmeticException("Exception Occoured");
		}
	}

	public static void main(String[] args) {
		
		throwExcptionIfBelow18 t1 = new throwExcptionIfBelow18();
		t1.checkAge();

	}

}
