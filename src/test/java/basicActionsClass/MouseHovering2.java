package basicActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseHovering2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ajio.com");
		 Actions ac = new Actions(driver);
		 driver.manage().window().fullscreen();
		 WebElement a = driver.findElement(By.xpath("//span[text()='MEN']"));
		 ac.moveToElement(a);
		 ac.perform();
	}
}
