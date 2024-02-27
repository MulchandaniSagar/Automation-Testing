package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginUsingXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("Sagar.mulchandani@gmail.com");
		driver.findElement(By.xpath("//input[@name ='pass']")).sendKeys("Test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
