package java_Projects;

import java.util.Scanner;

public class AverageAndReminder {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter of how many number you need Average of:");
		int Size = s1.nextInt();
		
		int Avg[] = new int[Size];
		System.out.println("Enter " +Size+ " numbers to find its average");
		for (int i=0;i<Size;i++)
		{
			Avg[i] = s1.nextInt();
		}
		int sum = 0;
		for (int j = 0 ; j<Avg.length ;j++)
		{
			sum = sum + Avg[j];
		}
		
		System.out.println("The Sum of "+Size+ " numbers are " + sum);
		double Average = sum / (Avg.length);
		System.out.println("The Average is " + Average);
		
		double reminder = sum % (Avg.length);
		System.out.println(reminder);
			
	}

}
