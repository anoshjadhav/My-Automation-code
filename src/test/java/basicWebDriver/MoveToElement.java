package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
			public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.navigate().to("https://myntra.com");
				Actions ac = new Actions(driver);
				
				WebElement find = driver.findElement(By.xpath("//a[text()='Men']"));
				ac.moveToElement(find).build().perform();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
			}
}
