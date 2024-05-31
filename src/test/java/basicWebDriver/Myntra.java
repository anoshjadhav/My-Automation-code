package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com");
			driver.findElement(By.className("desktop-searchBar")).sendKeys("watch");
			driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
			driver.findElement(By.xpath("//label[text()='Men']")).click();
		}
}
