package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForDWS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement reg = driver.findElement(By.partialLinkText("Register"));
		reg.click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement lgn = driver.findElement(By.partialLinkText("Log in"));
		lgn.click();
		driver.navigate().back();
		driver.close();
	}
}
