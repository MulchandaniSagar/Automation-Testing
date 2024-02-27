package java_Projects;

import java.util.Arrays;

public class SortingOfAnArray {

	public static void main(String[] args) {
		
		String str[] = new String[3];
		str[0] = "Sagar";
		str[1] = "Ashok";
		str[2] = "Mulchandani";
		System.out.println("The String is: ");
		for (int i = 0 ; i<3 ;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		
		
	}

}
