package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDispSel {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\sagar.mulchandani\\Desktop\\jsam.html");
		driver.manage().window().maximize();
		WebElement check1 = driver.findElement(By.xpath("(//input[@id='121'])[1]"));

		
		if(check1.isDisplayed())
		{
			if(check1.isEnabled())
			{
				check1.sendKeys("Check");
			}
			else
			{
				System.out.println("I am disabled");
			}
		}
		
		WebElement check2 =driver.findElement(By.xpath("//input[@id='123']"));
		WebElement check3 =driver.findElement(By.xpath("//input[@id='121']"));
		WebElement check4 =driver.findElement(By.xpath("//input[@id='321']"));
		check2.click(); 
		check4.click(); 
		
		if(check2.isDisplayed() == true && check2.isSelected() == true)
		{
			System.out.println("I am a Boy is clicked");
		}
		 if(check3.isDisplayed() == true && check3.isSelected() == true)
		{
			System.out.println("I am a Girl is clicked");
		}
		if (check4.isDisplayed() == true && check4.isSelected() == true)
		{
			System.out.println("I am Baby is Clicked");
		}
		
		

	}

}
