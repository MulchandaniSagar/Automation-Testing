package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickUAEUkUsingPartialLinkText {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://amazon.in");
		
		for (int i=0 ; i <2 ; i++)
		{
		driver.findElement(By.partialLinkText("United Arab")).click();
		driver.findElement(By.partialLinkText(null)).click();
		driver.findElement(By.partialLinkText(null)).click();
		}
	}

}
