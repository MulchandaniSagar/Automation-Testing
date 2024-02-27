package seleniumProjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonShoesAndAddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(dropdown);
		s1.selectByValue("search-alias=fashion");
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		searchbox.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> shoes_sugges =driver.findElements(By.xpath("//div/div/div[@class='s-suggestion-container']"));
		shoes_sugges.size();
		
		WebElement shoeAutoSelected  = shoes_sugges.get(shoes_sugges.size()-5);
		shoeAutoSelected.click();
		
		List<WebElement> shoeslist = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		shoeslist.get(shoeslist.size()-35).click();
		
		Set<String> PcId =driver.getWindowHandles();
		Iterator<String> iteratorid =PcId.iterator();
		String ppid	= iteratorid.next();
		String ccid = iteratorid.next();
		driver.switchTo().window(ccid);
		WebElement AddtoCart =driver.findElement(By.id("add-to-cart-button"));
		AddtoCart.click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("sagar.mulchandani1310@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("akds1310");
		driver.findElement(By.id("auth-signin-button")).click();
	}

}
