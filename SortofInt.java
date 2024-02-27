package java_Projects;

import java.util.Arrays;
import java.util.Scanner;

public class SortofInt {

	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Size of an Int Array");
		int Size = s1.nextInt();
		int rollno[] = new int[Size];
		System.out.println("enter the " + Size + " Rollno to sort :" );
		for(int j = 0 ; j<Size ;j++)
		{
			rollno[j] = s1.nextInt();
		}
		
		Arrays.toString(rollno);
		Arrays.sort(rollno);
		System.out.println("The Sorted rollno are  : "+Arrays.toString(rollno));
		

	}

}
