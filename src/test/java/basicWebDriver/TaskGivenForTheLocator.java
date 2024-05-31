package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskGivenForTheLocator {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		String acUrl = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com");
		String cuUrl= driver.getCurrentUrl();
		if (acUrl.contains(cuUrl)) {
			System.out.println("page is verify");
		}
		WebElement ele = driver.findElement(By.linkText("Register"));
		String acTit = "Demo Web Shop";
		String cuTit = driver.getTitle();
		if (acTit.contains(cuTit)) {
			System.out.println("Title Verify");
		}
		ele.click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Anosh");
		driver.findElement(By.id("LastName")).sendKeys("jadhav");
		driver.findElement(By.id("Email")).sendKeys("anoshjadhav763@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("anosh@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("anosh@123");
		driver.findElement(By.id("register-button")).click();
		driver.navigate().back();
		driver.close();
	}
}
