package seleniumProjects;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchAmazonAndClickMobile {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		
	}

}
