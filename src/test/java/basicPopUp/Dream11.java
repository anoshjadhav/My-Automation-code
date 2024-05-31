package basicPopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dream11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.PAGE_DOWN).build().perform();
		
		driver.switchTo().frame("send-sms-iframe");
		Thread.sleep(1000);
		Set<String> win = driver.getWindowHandles();
//		Thread.sleep(2500);
		driver.findElement(By.id("regEmail")).sendKeys("7620254197");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("menu_parent")).click();
		System.out.println(win);
		
	}
}
