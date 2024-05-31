package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentTwo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class ='img_rb_vertical'])[1]")).click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("(//img[@class ='img_rb_vertical'])[1]")).click();
		 driver.navigate().refresh();
		WebElement webele = driver.findElement(By.xpath("(//img[@class ='img_rb_vertical'])[1]"));
		if (webele.isDisplayed()) {
			System.out.println("bus is verify");
		}
		driver.close();
	}
}
