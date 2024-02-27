package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbiBo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com");
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='aamIframeLoaded']"));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-83 TdSAp'])[1]")).click();
		driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])[1]")).sendKeys("BOM");
		//driver.findElement(By.)
		
	}

}
