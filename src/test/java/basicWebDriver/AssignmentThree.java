package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.get("https://www.redbus.in/");
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(3000);
		driver.navigate().to("https://www.redbus.in/");
		driver.navigate().refresh();
		driver.navigate().back();
		WebElement webele = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
		Thread.sleep(3000);
		if (webele.isDisplayed()) {
			System.out.println("dws is verify");
		}
		driver.close();
	}
}
