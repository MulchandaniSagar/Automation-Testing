package seleniumProjects;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLastName {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		String str = "SAGAR ASHOK MULCHANDANI";
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(str);
		//char c[] =str.toCharArray();
		String check[] = str.split(" ");
		Arrays.toString(check);
		System.out.println(check[2]);
		int delTill = check[2].length();
		System.out.println(delTill);
		System.out.println(check.length-1);
		
		for (int i=str.length() ; i>=delTill;i--)
		{
			
			 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(Keys.BACK_SPACE);
		}
		
		

	}

}
