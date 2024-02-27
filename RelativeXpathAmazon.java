package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class RelativeXpathAmazon {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("Shoes");
		driver.findElement(By.xpath("(//input)[6]")).click();
	}

}
