package seleniumProjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JsPopup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
	
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
