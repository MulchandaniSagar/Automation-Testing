package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAndUpload {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement choose = driver.findElement(By.id("Resume"));
		choose.sendKeys("C:\\Users\\sagar.mulchandani\\Desktop\\Test.txt");
		
		
		

	}

}
