package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("Shoes");
	Thread.sleep(3000);
	List<WebElement> auto_sugg = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	int count = auto_sugg.size();
	auto_sugg.get(count-3).click();
	
	
	}

}
