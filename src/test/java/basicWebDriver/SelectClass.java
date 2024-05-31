package basicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/HP/Desktop/demo.html");
			WebElement tE = driver.findElement(By.id("standard_cars"));
			Select sc = new Select(tE);
			List<WebElement> op = sc.getOptions();			
			int i = 0;
//			op.forEach((web)->sc.selectByIndex(i));
			for (WebElement webElement : op) {
//			
				sc.selectByIndex(i);
				Thread.sleep(1000);
				sc.deselectByIndex(i);
				i++;
				System.out.println(webElement);
			}
			driver.close();
		}
		
}
