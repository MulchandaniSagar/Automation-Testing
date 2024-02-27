package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownKeysUseInMKTWeb {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@name='Skills']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//select[@name='Skills']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//select[@name='Skills']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//select[@id='technicalskills']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//select[@id='technicalskills']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//select[@id='technicalskills']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//select[@id='technicalskills']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//select[@name='Country'])[1]")).sendKeys(Keys.ENTER);
		for (int i=0 ; i<=7;i++)
		{
			driver.findElement(By.xpath("(//select[@name='Country'])[1]")).sendKeys(Keys.DOWN);
		}
		driver.findElement(By.xpath("//select[@name='Relegion']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//select[@name='Relegion']")).sendKeys(Keys.ENTER);
		
		
		

	}

}
