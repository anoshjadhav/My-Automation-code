package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demo.vtiger.com/vtigercrm");
			 Rectangle re = driver.findElement(By.id("username")).getRect();
			System.out.println(re.getWidth());
			System.out.println(re.getHeight());
			System.out.println(re.getX());
			System.out.println(re.getY());
//			System.out.println(re.getDimension());
//			System.out.println(re.getPoint());
	}
}
