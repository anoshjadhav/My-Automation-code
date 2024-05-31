package basicPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ifreame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Downloads/iframe-1.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Actions ac = new Actions(driver);
//		ac.keyDown(Keys.PAGE_DOWN).build().perform();
		
		driver.switchTo().frame("FR1");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("selenium007");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@text()='Google'")).click();
	}
}
