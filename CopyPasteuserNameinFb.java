package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteuserNameinFb {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sagar.mulchandani@gmail.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.CONTROL+"A");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.CONTROL+"C");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Keys.CONTROL+"V");
	
		
	}

}
