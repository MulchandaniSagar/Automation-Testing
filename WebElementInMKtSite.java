package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInMKtSite {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fname =driver.findElement(By.id("fname"));
		fname.sendKeys("Sagar");
		WebElement lname =driver.findElement(By.name("lname"));
		lname.sendKeys("Mulchandani");
		WebElement userName =driver.findElement(By.xpath("//input[@id='Username']"));
		userName.sendKeys("SAM");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("TestPassword");
		WebElement male = driver.findElement(By.xpath("//input[@id='Male']"));
		male.click();
		WebElement pres_add = driver.findElement(By.xpath("//textarea[@id='w3review']"));
		pres_add.sendKeys("Test Adress");
		WebElement perm_add = driver.findElement(By.xpath("//textarea[@id='Address']"));
		perm_add.sendKeys("Permenant Adress");
		WebElement pin = driver.findElement(By.id("Pincode"));
		pin.sendKeys("421001");
		WebElement agree= driver.findElement(By.id("Agree"));
		agree.click();
		
	}

}
