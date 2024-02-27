package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMKTSite {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement skill = driver.findElement(By.id("Skills"));
		
		Select s1 = new Select(skill);
		s1.selectByIndex(1);
		List<WebElement> count1=	s1.getOptions();
		int count =count1.size();
		System.out.println(count);
		WebElement country = driver.findElement(By.name("Country"));
		
		Select s2 = new Select(country);
		s2.selectByValue("India");
		
		WebElement relegion = driver.findElement(By.name("Relegion"));
		
		Select s3 = new Select(relegion);
		s3.selectByValue("Hindu");
		
		
	}

}
