package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		//step1. downcast javaScriptexecutor 
	     JavascriptExecutor d = (JavascriptExecutor)driver;	
	   //step2.  executeScript(String script, Object)
	     d.executeScript("window.scrollBy(7000,0)");//horizontal  
	     Thread.sleep(1000);	
	     d.executeScript("window.scrollBy(0,20000)"); //vertical
		
	}
}
