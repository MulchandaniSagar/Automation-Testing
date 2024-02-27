package java_Projects;

import java.util.Arrays;

public class Repeat {

	public static void main(String[] args) {

		String str = "I am going to be repeated";
		str.repeat(2);
		System.out.println(str.repeat(2));

		  String s[] = str.split(" ");
		
		  System.out.println( Arrays.toString(s));
		  System.out.println(s[2]);
	}

}
