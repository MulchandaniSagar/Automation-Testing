package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckReadyToRelocateJasmChek {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\sagar.mulchandani\\Desktop\\jsam.html");
		driver.manage().window().maximize();
		WebElement checkbox =driver.findElement(By.xpath("(//input)[13]"));
		
		
		if(checkbox.isSelected())
		{
			System.out.println("Ready to relocate");
		}
		else
		{
			checkbox.click();
		}

	}

}
