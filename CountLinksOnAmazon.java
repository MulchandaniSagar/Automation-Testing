package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CountLinksOnAmazon {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int noOfLinks = links.size();
		System.out.println("The Numer of Links Present on Amazon are : " + noOfLinks );
		
		for(int i=0 ; i<=noOfLinks-1 ; i++)
		{
			WebElement findAttribute = links.get(i);
			String url = findAttribute.getAttribute("href");
			System.out.println(url);
			String textName = 	findAttribute.getText();
			System.out.println(textName);
		
		}
		

	}

}
