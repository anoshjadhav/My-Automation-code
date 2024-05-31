package basicActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ajio.com/");
		WebElement search = driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
		Actions ac = new Actions(driver);
		ac.sendKeys(search,"watch");
		ac.perform();
	}
}
