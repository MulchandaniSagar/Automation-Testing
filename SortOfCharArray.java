package java_Projects;

import java.util.Arrays;
import java.util.Scanner;

public class SortOfCharArray {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of Double");
		int size = s1.nextInt();
		System.out.println("Enter the values of Double");
		double Alpha[] = new double[size];
		
		for(int i = 0 ; i<size ;i++)
		{
			Alpha[i] = s1.nextDouble();
			
		}

		Arrays.toString(Alpha);
		Arrays.sort(Alpha);
		System.out.println(Arrays.toString(Alpha));
		
	}

}
