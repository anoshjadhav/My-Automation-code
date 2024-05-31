package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//launch the application
		driver.get("https://licindia.in/");
		driver.manage().window().fullscreen();
		//find the element click on that
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		//click on the prompt alert 
		driver.findElement(By.xpath("//a[text()=' Login ']")).click();
		Thread.sleep(1000);
		//fetch the text which present inside on popup
		System.out.println(driver.switchTo().alert().getText());
	}
}
