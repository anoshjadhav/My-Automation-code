package basicPopUp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clickable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
//		driver.get("http://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		Actions ac = new Actions(driver);
		
	
		
		ac.keyDown(Keys.PAGE_DOWN).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("timerButton"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		driver.findElement(By.id("timerButton")).click();
	
		driver.switchTo().alert().accept();
		
		
		
	}
}
