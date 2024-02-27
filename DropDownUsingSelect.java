package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelect {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement drop_d = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(drop_d);
		s1.selectByValue("search-alias=fashion");
		s1.selectByIndex(10);
		s1.selectByVisibleText("Audible Audiobooks");
	}

}
