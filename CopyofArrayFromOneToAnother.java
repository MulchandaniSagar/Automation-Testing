package java_Projects;

import java.util.Arrays;

public class CopyofArrayFromOneToAnother {

	public static void main(String[] args) {
	
		System.out.println("Copy of array from one to Another");
		
		String str[] = new String[3];
		str[0] = "Sagar";
		str[1] = "Ashok";
		str[2] = "Mulchandani";
		
		String str2[] = new String[3];
		for (int i=0 ; i <3 ;i++)
		{
			str2[i] = str[i];
			
					
		}
		
		System.out.println("Array 1 is : " + Arrays.toString(str));
		System.out.println("Copy of Array is: " + Arrays.toString(str2));
		

	}

}
