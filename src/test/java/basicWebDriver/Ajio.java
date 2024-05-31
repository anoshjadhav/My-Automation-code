package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.ajio.com");
		Thread.sleep(2000);
		driver.findElement(By.name("searchVal")).sendKeys("prefums");
		//click on search icon
		driver.findElement(By.className("ic-search")).click();
		Thread.sleep(2000);
//		for the back direction
		driver.navigate().back();
		Thread.sleep(1000);
//		for the forward direction
		driver.navigate().forward();
		Thread.sleep(1000);
//		for the refreshing the page
		driver.navigate().refresh();
	}
}
