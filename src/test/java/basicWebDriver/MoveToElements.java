package basicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://myntra.com");
		Actions ac = new Actions(driver);
		
		List<WebElement> find = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div/div/a"));
		for (WebElement web: find) {
			ac.moveToElement(web).build().perform();
			Thread.sleep(1000);
		}
		driver.close();
		
	}
}
