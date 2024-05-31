package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demo.vtiger.com/vtigercrm");
			Dimension size = driver.findElement(By.id("username")).getSize();
			System.out.println(size);
	}
}
