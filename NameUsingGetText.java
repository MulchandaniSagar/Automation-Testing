package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NameUsingGetText {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		dd.click();
		
		Select s1 = new Select(dd);
		List<WebElement> options =s1.getOptions();
		int count = options.size();
		
		for(int i=0 ; i<= options.size()-1;i++)
		{
			System.out.println(dd.getText());
			
			
		}
		
		
		
		//List<WebElement> dropdown =dd.getSize();
		
		

	}

}
