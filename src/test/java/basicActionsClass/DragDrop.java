package basicActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		// created the object of the Action 
		// pass the actions pass the webdriver reference 
		Actions ac = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tag = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, tag);
		ac.perform();
	}
}
