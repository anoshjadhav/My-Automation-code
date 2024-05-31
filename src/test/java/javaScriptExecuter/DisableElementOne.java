package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DisableElementOne {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test/");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//identify the disable text feild
		WebElement idenDisable = driver.findElement(By.id("noEdit"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//step2  : call executeScript(String script,object)
		jse.executeScript("arguments[0].value='anosh'",idenDisable);
	}
}
