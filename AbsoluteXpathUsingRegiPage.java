package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathUsingRegiPage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sagar.mulchandani/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Sagar Mulchandani");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Hint : User is Automating");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Test123IsPassword");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Sagar");
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[6]")).click();
		driver.findElement(By.xpath("(html/body/input)[4]")).click();
		driver.findElement(By.xpath("(html/body/input)[6]")).click();
		//driver.findElement(By.xpath("/html/body/a")).click();
		driver.findElement(By.xpath("(/html/body/select/option)[3]")).click();
		//driver.findElement(By.xpath("(/html/body/input)[7]")).click();
		
	}

}
