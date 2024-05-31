package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("Anosh");
		driver.findElement(By.cssSelector("input[placeholder='Enter your Password']")).sendKeys("Anosh@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}
