package seleniumProjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Popup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\sagar.mulchandani\\Desktop\\learningHTML1 - Copy.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		

	}

}
