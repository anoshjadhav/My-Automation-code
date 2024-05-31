package basicSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) throws InterruptedException {
		//we upcasting the reference to the WebDriver in order to use the 15 method of the webDriver .
				WebDriver driver = new ChromeDriver();
				//launch the application
				driver.get("https://letcode.in/test");
				// find the Element 
				driver.findElement(By.linkText("Drop-Down")).click();
				// find select Element to identify the select Tag
				WebElement multi = driver.findElement(By.id("superheros"));
				//Create the select object to the all the options in the select 
				Select s = new Select(multi);
				Thread.sleep(1000);
				// here we have create the list to store the options inside the List<webElement>.
				List<WebElement> str = s.getOptions();
				int count = 1 ;
				for (WebElement webElement : str) {
					System.out.println(count++ +webElement.getText());
				}
   }
}
