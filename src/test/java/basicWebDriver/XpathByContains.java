package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String acUrl = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String cuUrl = driver.getCurrentUrl();
	
		if (acUrl.contains(cuUrl)) {
			System.out.println("verify");			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		}
		else {
			System.out.println("Not Match");
		}
		driver.quit();
	}
}
