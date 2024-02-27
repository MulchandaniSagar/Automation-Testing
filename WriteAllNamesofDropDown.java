package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WriteAllNamesofDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> dd = driver.findElements(By.id("searchDropdownBox"));
		Thread.sleep(2000);
		dd.size();
		System.out.println(dd.size());
		for(int i=0 ; i<=dd.size()-1 ; i++)
		{
			System.out.println(dd.get(i));		
		}
		//dropdown.click();
		
		//Select s1 = new Select(dropdown);
		
		
	}

}
