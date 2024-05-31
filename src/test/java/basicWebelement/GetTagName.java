package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		//launch the application
		driver.get("https://www.facebook.com/");
		
		String text = driver.findElement(By.id("email")).getTagName();
		System.out.println(text);
	}
}
