package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageByWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com");
		WebElement ele = driver.findElement(By.xpath("//div[@class='header-logo']"));
		if (ele.isDisplayed()) {
			System.out.println("your in the page");
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}
		else {
			System.out.println("your not in the page");
		}
	}
}
