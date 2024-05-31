package basicActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ClickandHold {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://webdriveruniversity.com/Actions/index.html");
			// created the object of the Action 
			// pass the actions pass the webdriver reference 
			Actions ac = new Actions(driver);
			
			WebElement button = driver.findElement(By.id("click-box"));
//			ac.clickAndHold(button);
			Thread.sleep(1000);
			// release targeted WebElement
			ac.release(button);
			ac.perform();
		}
}
