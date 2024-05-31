package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		//launch the application
		driver.get("https://www.tirabeauty.com");
		//find the element
		WebElement search = driver.findElement(By.id("search"));
		//send the value in that 
		search.sendKeys("perfums");
		// press Enter button
		search.sendKeys(Keys.ENTER);
		
	}
}
