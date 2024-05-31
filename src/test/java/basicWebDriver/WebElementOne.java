package basicWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementOne {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		// here we did Upcasting
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		//step no 1:- identitfy webElement 
		WebElement searchEle = driver.findElement(By.name("searchVal"));
		//call getScreenshot()
		File temfile = searchEle.getScreenshotAs(OutputType.FILE);
		//create object file
		File destination = new File("./images/anosh.png");
		 FileUtils.copyFile(temfile, destination);
	}
}
