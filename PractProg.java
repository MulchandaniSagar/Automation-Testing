package seleniumProjects;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class PractProg {

	public static void main(String[] args) {
		
	
		
		
		
		
		
		
	
		ChromeDriver c1 = new ChromeDriver();
		//c1.getClass();
		c1.get("https://flipkart.com");
		String title = c1.getTitle();
		
	String[] word1 = 	title.split(" ");
	
	System.out.println(Arrays.toString(word1));
	
	//System.out.println(word1[0].charAt(0));
	
	
	System.out.println(word1[0].toCharArray());
	
	
	
	/*
	 * for (int i=0 ; i<=word1.length ; i++) {
	 * System.out.println("word1["+i+"]="+word1[i]); }
	 */
	
	//System.out.println(word1.toString());
		
		//title.toCharArray();
		
		//System.out.println(title);
		
		//String words[] = new String[1000000];
		//char words2[] = new char[1000000];
		
		
		
		//for(int i=0 ; i<title.length() ; i++)
		//{
		//	words2[i]  = title.charAt(i);
		//}
		
		
		//for(int i=0 ; i<title.length() ; i++)
		//{
		//	System.out.print(words2[i]);
		//	
		//}

	}

}
