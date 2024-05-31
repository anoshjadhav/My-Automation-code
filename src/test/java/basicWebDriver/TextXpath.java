package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String acUrl = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String cuUrl = driver.getCurrentUrl();
	
		if (acUrl.contains(cuUrl)) {
			System.out.println("verify");
			driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("anosh jadhav");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[@class=''])[1]")).click();
		}
		else {
			System.out.println("Not Match");
		}
		driver.quit();
	}
}
