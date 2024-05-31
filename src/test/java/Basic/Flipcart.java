package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.flipcart.com");
		 
		 driver.findElement(By.xpath("//span[text()='Grocery'")).click();
//		driver.get(null);
		 }
}

