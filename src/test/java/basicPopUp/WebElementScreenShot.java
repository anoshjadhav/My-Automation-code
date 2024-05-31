package basicPopUp;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot  {
	
	public static void main(String[] args) throws IOException {
		LocalDateTime date = LocalDateTime.now();
		String changeDate=date.toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement allu = driver.findElement(By.id("homeV2-root"));
		File from = allu.getScreenshotAs(OutputType.FILE);
		File to = new File(".\\img\\allu"+changeDate+".png");
		FileHandler.copy(from, to);
	}
}
