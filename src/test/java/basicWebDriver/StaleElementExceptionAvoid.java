package basicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementExceptionAvoid {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/digital-downloads?orderby=6");
		WebElement tE = driver.findElement(By.id("products-orderby"));
		Select sc = new Select(tE);
		List<WebElement> op = sc.getOptions();			
		int i = 0;
		for (WebElement webElement : op) {
			tE=driver.findElement(By.id("products-orderby"));
			sc = new Select(tE);
			sc.selectByIndex(i);
			i++;
			System.out.println(webElement);
		}
		driver.close();
	}
}
