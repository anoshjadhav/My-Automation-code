package basicPopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenShot {
	public static void main(String[] args) throws IOException {
		ChromeOptions op = new ChromeOptions();
		WebDriver driver = new ChromeDriver(op);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.com/");
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\HP\\eclipse-workspace\\selenium\\img\\red.png");
		FileHandler.copy(from, to); 
		
	}
}
