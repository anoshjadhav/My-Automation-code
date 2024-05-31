package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/simple.html");
		driver.findElement(By.cssSelector("input[value='a']")).sendKeys("anosh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='b']")).click();
//		driver.findElement(By.cssSelector("input[value='c']")).click();
	}
}
