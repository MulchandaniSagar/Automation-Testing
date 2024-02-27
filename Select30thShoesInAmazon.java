package seleniumProjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select30thShoesInAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("Shoes");
		Searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> shoes =driver.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
		Thread.sleep(2000);
		shoes.size();
		System.out.println(shoes.size());
		shoes.get(30).click();
		Set<String> handels =driver.getWindowHandles();
		Iterator<String> itr =handels.iterator();
		String pid = itr.next();
		String cid = itr.next();
		driver.switchTo().window(cid);
		driver.findElement(By.id("add-to-cart-button")).click();
		//Actions a1 = new Actions(driver);
		//WebElement hover = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		//a1.moveToElement(hover).perform();
		
		
	}

}
