package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssAttrValue {
	 public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demo.vtiger.com/vtigercrm");
			String  attr = driver.findElement(By.id("username")).getCssValue("border-image-repet");
			System.out.println(attr);
	}	

}
