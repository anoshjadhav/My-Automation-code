package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoction {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demo.vtiger.com/vtigercrm");
			Point se = driver.findElement(By.id("username")).getLocation();
			System.out.println(se);
	}
}
