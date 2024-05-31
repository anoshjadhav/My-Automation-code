package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChangingTheDate {
	public static void main(String[] args) {
		ChromeOptions op  = new ChromeOptions();
		WebDriver driver = new ChromeDriver(op);
		driver.navigate().to("https://www.agoda.com/");
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-30']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[@data-selenium-date='2024-07-24']']")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
	}
}
