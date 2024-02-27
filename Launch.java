package seleniumProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {
		
		ChromeDriver c1 = new ChromeDriver();
		c1.getClass();
		c1.get("https://www.google.com");
		//c1.manage().window().maximize();
		
		
		EdgeDriver e1 = new EdgeDriver();
		
		
	}

}
