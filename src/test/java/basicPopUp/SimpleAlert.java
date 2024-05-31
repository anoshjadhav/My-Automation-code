package basicPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.partialLinkText("Alert with OK ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Alert with OK & Cancel ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Alert with OK & Cancel ')]"));
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Alert with Textbox ")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Alert with Textbox ')]"));
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("jay");
	}
}
