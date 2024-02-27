package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonBooksDropDownusingKeys {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(Keys.ENTER);
		
		for (int i=0;i<=10;i++)
		{
			
			driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(Keys.DOWN);
		}
		
		/*
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 * driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(
		 * Keys.DOWN);
		 */
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Autobiography");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
	}

}
