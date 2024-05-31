package basicActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropByLastMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		// created the object of the Action 
		// pass the actions pass the webdriver reference 
		WebElement f = driver.findElement(By.className("demo-frame"));
		Actions ac = new Actions(driver);
		driver.switchTo().frame(f);
		WebElement box = driver.findElement(By.id("draggable"));
//		WebElement tag = driver.findElement(By.id("droppable"));
		ac.dragAndDropBy(box,100,50);
		ac.perform();
	}
}
