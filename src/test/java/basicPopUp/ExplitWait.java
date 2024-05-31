package basicPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(789));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(4000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Account']")));
		driver.findElement(By.id("//span[text()='Create Account']")).click();
	
	}
}
