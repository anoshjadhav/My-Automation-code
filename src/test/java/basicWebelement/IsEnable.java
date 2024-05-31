package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demoapp.skillrary.com/");
			 boolean re = driver.findElement(By.cssSelector("input[class='form-control']")).isEnabled();
			System.out.println(re);
	}
}
