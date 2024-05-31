package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		//launch the application
		driver.get("https://www.facebook.com/");
		 driver.findElement(By.name("login")).submit();
	}
}
