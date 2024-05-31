package basicWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoWEbShop {
		public static void main(String[] args) throws InterruptedException {
			String actualUrl = "https://demowebshop.tricentis.com/";
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://demowebshop.tricentis.com");
			String curentUrl = driver.getCurrentUrl();
			if (actualUrl.equals(curentUrl)) {
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
