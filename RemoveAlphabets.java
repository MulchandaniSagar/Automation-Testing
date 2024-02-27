package java_Projects;

import java.util.Scanner;

public class RemoveAlphabets {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Alpha Numeric Characters");
		String str = s1.next();
		System.out.println("The String is : " + str);
		str.replaceAll("[a-z]", "");
		System.out.println("Replaced String is " + str.replaceAll("[a-z]", ""));
		System.out.println("Enter Another Alpha Numeric String String : ");
		String str2 = s1.next();
		str2.replaceAll("[0-9]", "");
		System.out.println("Replaced String is " + str2.replaceAll("[0-9]", ""));
		
		

	}

}
