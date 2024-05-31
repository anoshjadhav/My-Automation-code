package basicPopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotWithTime {
	public static void main(String[] args) throws IOException {
		LocalDateTime date =  LocalDateTime.now();
		System.out.println(date);	
		String newDate = date.toString().replace(":", "-");
		System.out.println(newDate);
		ChromeOptions op = new ChromeOptions();
		WebDriver driver = new ChromeDriver(op);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File(".\\img\\redbus"+newDate+".png");
		FileHandler.copy(from, to); 
		
	}
}
