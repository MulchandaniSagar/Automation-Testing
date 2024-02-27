package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAndFindList {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(2000);
		List <WebElement> auto_list = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count_auto = auto_list.size();
		System.out.println(count_auto);
		auto_list.get(count_auto-3).click();
		
	}

}
