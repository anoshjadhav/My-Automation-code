package basicSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) throws InterruptedException {
		//we upcasting the reference to the WebDriver in order to use the 15 method of the webDriver .
		WebDriver driver = new ChromeDriver();
		//launch the application
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Drop-Down")).click();
		
		WebElement multi = driver.findElement(By.id("superheros"));
		Select s = new Select(multi);
		System.out.println(s.isMultiple());
		s.selectByValue("aq");
		s.selectByVisibleText("The Avengers");
		s.selectByVisibleText("Ant-Man");
		Thread.sleep(1000);
//		s.deselectByVisibleText("Ant-Man");
//		s.deselectByValue("am");
	
//		System.out.println(s.getFirstSelectedOption().getText());
		List<WebElement> str = s.getAllSelectedOptions();
		for (WebElement webElement : str) {
			System.out.println(webElement.getText());
		}
	}
}
