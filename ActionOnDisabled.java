package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnDisabled {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\sagar.mulchandani\\Desktop\\jsam.html");
		driver.manage().window().maximize();
		try {
		WebElement check1 = driver.findElement(By.xpath("(//input[@id='121'])[1]"));
		check1.sendKeys("Sagar");
		}
		catch (Exception e)
		{
			System.out.println(e.getClass());
		}

	}

}
