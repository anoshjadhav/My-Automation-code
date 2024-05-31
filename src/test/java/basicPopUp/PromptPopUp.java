package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//launch the application
		driver.get("https://letcode.in/test");
		//find the element click on that
		driver.findElement(By.linkText("Dialog")).click();
		//click on the prompt alert 
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("anosh jadhav");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	
		
	}
}
