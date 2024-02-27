package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DropDownsText {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		
		WebElement electro = driver.findElement(By.xpath("(//span[@class='_27h2j1'])[2]"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(electro).perform();
		Thread.sleep(2000);
		//List<WebElement> list = driver.findElements(By.xpath("//div/object/a[@class='_1BJVlg']"));
		
		Select s1 = new Select(electro);
		List <WebElement> options =s1.getOptions();
		options.size();
		
		
		
	
		
		
		System.out.println(options.size());
		
		for (int i=0 ; i<=options.size()-1;i++)
		{
			
		}

	}

}
