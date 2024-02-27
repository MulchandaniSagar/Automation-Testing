package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOffFolder {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement prd = driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
		prd.click();
		
	}

}
