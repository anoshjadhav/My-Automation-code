package basicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsmethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
	    List<WebElement> list = driver.findElements(By.xpath("//div[@class='header-links']/ul/li"));
		for (WebElement web: list) {
			web.click();
			driver.navigate().back();
		}
	    driver.close();
	}
}
