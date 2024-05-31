package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//launch the application
		driver.get("https://letcode.in/test");
		//find the element click on that
		driver.findElement(By.linkText("Dialog")).click();
		//click on the confirm alert 
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}
}
