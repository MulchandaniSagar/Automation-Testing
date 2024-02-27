package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksInWeb {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		listOfLinks.size();
		System.out.println(listOfLinks.size());
	}

}
