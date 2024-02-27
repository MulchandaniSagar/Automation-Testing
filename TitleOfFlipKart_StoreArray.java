package seleniumProjects;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfFlipKart_StoreArray {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		String str = driver.getTitle();
		String[] word  = str.split(" ");
		Arrays.toString(word);
		System.out.println(Arrays.toString(word));
		
		for (int i =0 ; i<word.length ;i++)
		{
			System.out.println(word[i]);
		}
		 
		
		
		

	}

}
