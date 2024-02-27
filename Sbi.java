package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		WebElement LoginBtn = driver.findElement(By.xpath("//span[.='LOGIN']"));
		LoginBtn.click();
		WebElement ContLogin = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		ContLogin.click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Sagar");
		WebElement pass = driver.findElement(By.id("label2"));
		pass.sendKeys("Test@123");
		WebElement Captcha = driver.findElement(By.id("loginCaptchaValue"));
		Captcha.sendKeys("Test");
		
	}

}
