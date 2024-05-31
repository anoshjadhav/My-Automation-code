package basicWebelement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("anoshjadhav@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");


	}
}
