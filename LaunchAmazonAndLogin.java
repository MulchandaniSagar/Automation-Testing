package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchAmazonAndLogin {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Test");
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
	}

}
