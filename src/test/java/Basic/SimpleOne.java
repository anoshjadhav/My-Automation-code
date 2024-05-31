package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleOne {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/simple.html");
		// X path syntax is the  
		driver.findElement(By.xpath("//input[@value='a' and @type='text']")).sendKeys("anosh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='save']")).click();
//		driver.findElement(By.cssSelector("input[value='b']")).click();
		
//		driver.findElement(By.cssSelector("input[value='c']")).click();
	}
}
