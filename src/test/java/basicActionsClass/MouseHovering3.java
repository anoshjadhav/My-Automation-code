
// for the forward dirceion to hover the mouse
package basicActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ajio.com");
		//create the action class for performing the action on the webpage
		Actions ac = new Actions(driver);
		//adjust the screen
		driver.manage().window().fullscreen();
		//create the variable for the element on which you want to perform the opration
		WebElement str = driver.findElement(By.xpath("//span[text()='MEN']"));
		//we can hover the mouse to forward direction
		ac.moveToElement(str, 100, 0);
		// this method fnally performing the action on the webpage.
		ac.perform();
		
	}
}
