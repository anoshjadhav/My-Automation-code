package basicWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {
	public static void main(String[] args) throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("perfums");
		driver.findElement(By.className("desktop-submit")).click();
		WebElement perfumes = driver.findElement(By.cssSelector("img[alt='Clinique Women Happy Perfume Spray 100 ml']"));
		File temFile = perfumes.getScreenshotAs(OutputType.FILE);
		File destination = new File(".images/perfumes.png");
		FileUtils.copyDirectory(temFile, destination);
	}
}
