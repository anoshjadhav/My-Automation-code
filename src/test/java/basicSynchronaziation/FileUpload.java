package basicSynchronaziation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(1000);
		driver.findElement(By.id("file_wraper0")).click();
		
	}
}
