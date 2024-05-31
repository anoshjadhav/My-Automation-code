package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWindowHandls {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		String parentWin = driver.getWindowHandle();
		Set<String> parentWins = driver.getWindowHandles();
		System.out.println("here we have used the getWindowHandle"+parentWin);
		System.out.println("here we have used the getWindowHandles"+parentWins);
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Set<String> multi = driver.getWindowHandles();
		System.out.println(multi);
		int i = 0 ;
		for (String str : multi) {
			if (i==1) {
				driver.switchTo().window(str);
			}
			i++;
		}
		String f = driver.getCurrentUrl();
		System.out.println(f);
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("anoshjadhav763@gmail.com");
		Thread.sleep(1000);
		driver.quit();
	}
}
