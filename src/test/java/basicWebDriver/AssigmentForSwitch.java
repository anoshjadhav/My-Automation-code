package basicWebDriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssigmentForSwitch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Set<String> add3 = driver.getWindowHandles();
		String facebook = "https://www.facebook.com/nopCommerce";
		String twitter = "https://twitter.com/nopCommerce";
		Thread.sleep(1000);
		for (String str1 : add3) {
			driver.switchTo().window(str1);
			String cUrl  = driver.getCurrentUrl();
			if (facebook.equals(cUrl)) {
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("anosh jadhav");
				driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("anosh@123");
			}
			else if (twitter.equals(cUrl)) {
//				driver.findElement(By.xpath("//span[text()='Create account']")).click();				
//				driver.findElement(By.xpath("//input[@name='name']")).sendKeys("anosh");
//				driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("7620254197");
			}	
			Thread.sleep(1000);
		}
		Thread.sleep(20000);
		driver.quit();
	}
}
