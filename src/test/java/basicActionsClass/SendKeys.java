package basicActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ajio.com/");
		
		Actions ac = new Actions(driver);
		
	
		ac.sendKeys(Keys.PAGE_DOWN);
		
		ac.perform();
		
	}
}
