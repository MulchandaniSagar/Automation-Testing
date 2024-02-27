package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOfBooks {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.=' Books ']"));
	
		driver.findElement(By.xpath("//a[.=' Mobiles  ']"));
		
		driver.findElement(By.xpath("//a[.=' Clothes  ']"));
		
		driver.findElement(By.xpath("//a[.=' Choclates  ']"));
		
		
	}

}
