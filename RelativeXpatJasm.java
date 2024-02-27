package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpatJasm {

	public static void main(String[] args) {
		System.out.println("Relative using First Way - Ideally should not be used");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sagar.mulchandani/Desktop/learningHTML1.html");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("HINT - Test");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("PASSWORD");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Sagar");
		driver.findElement(By.xpath("(//input)[7]")).click();
		driver.findElement(By.xpath("(//input)[8]")).click();
		driver.findElement(By.xpath("(//input)[9]")).click();
		driver.findElement(By.xpath("(//input)[11]")).click();
		driver.findElement(By.xpath("(//input)[13]")).click();
		driver.findElement(By.xpath("(//option)[3]")).click();
		//driver.findElement(By.xpath("//a")).click();
		
		

	}

}
