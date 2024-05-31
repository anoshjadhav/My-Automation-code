package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	public static void main(String[] args) {
		ChromeOptions op  = new ChromeOptions();
		WebDriver driver = new ChromeDriver(op);
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("pune");
		driver.findElement(By.id("dest")).sendKeys("rotegaon");
		driver.findElement(By.id("onwardCal")).click();
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']")).click();
	}
}
