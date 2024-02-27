package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameFromJSAM {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sagar.mulchandani/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("a")).click();

	}

}
