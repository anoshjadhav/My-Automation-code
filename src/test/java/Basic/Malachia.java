package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Malachia {
	 public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://shop-global.malaicha.com/login");
		  driver.findElement(By.xpath("//button[text()='Register']")).click();
	}
}
