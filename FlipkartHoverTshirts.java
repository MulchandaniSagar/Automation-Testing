package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverTshirts {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Actions a1 = new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[3]"));
		a1.moveToElement(fashion).perform();
		WebElement MensTshirt = driver.findElement(By.xpath("(//a[@class='_3490ry'])[2]"));
		MensTshirt.click();
	}

}
