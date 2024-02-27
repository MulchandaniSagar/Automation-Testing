package java_Projects;

import java.util.Scanner;

public class FetchDataFromScanner {

	public static void main(String[] args) {
		
		int Array[] = new int[5];
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value of 5 Integers");
		
		for (int i = 0 ; i<5 ; i++)
		{
		Array[i] = s1.nextInt();
		}
		
		System.out.println("The Value of 5 Integers are: ");
		
		for (int j = 0 ; j<5 ; j++)
		{
			System.out.println(Array[j]);
		}
		
		
	}

}
