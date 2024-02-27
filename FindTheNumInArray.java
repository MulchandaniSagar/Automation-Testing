package java_Projects;

import java.util.Scanner;

public class FindTheNumInArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the length of an array");
		Scanner s1 = new Scanner(System.in);
		int no = s1.nextInt();
		System.out.println("Enter "+no + " Numbers");
		int a[] = new int[no];
		
		
		for (int i=0;i<no;i++)
		{
			a[i] = s1.nextInt();
		}

		System.out.println("Enter the number you wish to find in array");
		int find = s1.nextInt();
		
		for (int i=0;i<no;i++)
		{
			if (a[i] == find )
			{
				System.out.println("The Number " + a[i] + " Is present at index " + i);
				
			}
			else
			{
				System.out.println("No. not found");
				
			}
		}
		
		

	}

}
