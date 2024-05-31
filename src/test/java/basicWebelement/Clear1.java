package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		//launch the application
		driver.get("https://demo.vtiger.com/vtigercrm/");
//		find the element 
//		and used for the clear method
		driver.findElement(By.id("username")).clear();
	}
}
