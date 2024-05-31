package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpForCalender {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.agoda.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label='Fri May 31 2024']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label='Mon Jun 10 2024']")).click();
	}
}
