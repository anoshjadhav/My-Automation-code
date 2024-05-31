package basicPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskSwitchTheCotrol {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			Actions ac = new Actions(driver);
			ac.keyDown(Keys.PAGE_DOWN);
			driver.findElement(By.linkText("Facebook")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Twitter")).click();
			Set<String> add=driver.getWindowHandles();
			String demo = "https://demowebshop.tricentis.com/";
			String fa = "https://www.facebook.com/nopCommerce";
			String t = "https://twitter.com/i/flow/signup";
			for (String str : add) {
				driver.switchTo().window(str);
				String cUrl=driver.getCurrentUrl();
				
				if (cUrl.equals(demo)) {
					
					driver.findElement(By.id("newsletter-email")).sendKeys("anosh");
					Thread.sleep(1000);
				}
				else if (cUrl.equals(fa)) {
					
					driver.findElement(By.id(":rq:")).sendKeys("anosh");
					Thread.sleep(1000);
					driver.findElement(By.id(":rt:")).sendKeys("anosh@123");
					Thread.sleep(1000);
				}
				else if (cUrl.equals(t)){
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[text()='Create account']")).click();
					Thread.sleep(1000);
					//input[@autocomplete='name']
					driver.findElement(By.xpath("//input[@autocomplete='name']")).sendKeys("anosh");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@autocomplete='tel']")).sendKeys("7620254197");
					
				}
			}
			Thread.sleep(5000);
//			driver.quit();
		}
}
