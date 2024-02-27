package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dropDown);
		s1.selectByVisibleText("Books");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Biography");
		Thread.sleep(2000);
		List<WebElement> auto_Sugg =	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = auto_Sugg.size();
		auto_Sugg.get(count-2).click();
		
	
		
	}

}
