package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demoapp.skillrary.com/login.php?type=register");
			 boolean iD = driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
			System.out.println(iD);
	}
}
