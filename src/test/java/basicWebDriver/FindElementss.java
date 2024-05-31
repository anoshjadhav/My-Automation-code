package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementss {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://demowebshop.tricentis.com/");
			WebElement Dd = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
			Dd.click();
		}
}
