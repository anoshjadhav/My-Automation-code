package basicActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClicking {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions ac = new Actions(driver);
		WebElement web = driver.findElement(By.xpath("//span[text()='Double-Click Me To See Alert']"));
		ac.doubleClick(web);
		ac.perform();
				
	}

}
