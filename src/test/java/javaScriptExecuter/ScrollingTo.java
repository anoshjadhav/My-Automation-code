package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		JavascriptExecutor d = (JavascriptExecutor)driver;
		d.executeScript("window.scrollTo(0,document.body.scrollHeight)");//complete scrolling top to bottom
		Thread.sleep(1000);
		d.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//complete scrolling bottom to top
		Thread.sleep(1000);
		d.executeScript("window.scrollTo(document.body.scrollHeight,0)");//complete scrolling left to right
		Thread.sleep(1000);
		d.executeScript("window.scrollTo(document.body.scrollHeight,0)");//complete scrolling right to left
	}
}
