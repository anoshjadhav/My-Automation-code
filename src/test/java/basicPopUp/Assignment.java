package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[1]")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[6]")).click();
	}
}
