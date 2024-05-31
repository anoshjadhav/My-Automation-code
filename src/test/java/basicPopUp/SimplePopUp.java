package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimplePopUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//launch the application
		driver.get("https://letcode.in/test");
		//find the element click on that
		driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		//click on the simple popup 
		driver.findElement(By.id("accept")).click();
		//to click on the ok button
		driver.switchTo().alert().accept();
	}
}
