package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		JavascriptExecutor d = (JavascriptExecutor)driver;
		d.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(2000);
		d.executeScript("window.scrollTo(2000,0)");
		Thread.sleep(1000);
		d.executeScript("window.scrollTo(-400,0)");
		Thread.sleep(1000);
		d.executeScript("window.scrollTo(+400,0)");
		
	}
}
