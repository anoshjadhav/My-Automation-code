package basicWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();// here we did Upcasting
		driver.get("https://www.myntra.com");
		// 1 downcast the reference
		TakesScreenshot ts  = (TakesScreenshot) driver;
	    // 2 call getScreenshot() & store inside file form	
		 File temfile =  ts.getScreenshotAs(OutputType.FILE);
//		 3.create File object of File class
		 File destination = new File("./images/anosh.png");
//		 4.call copyFile() form fileutils class
		 FileUtils.copyFile(temfile, destination);
		 // refresh the peoject
	}
}
