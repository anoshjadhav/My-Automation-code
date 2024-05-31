package basicWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://letcode.in/radio");
			 boolean iS = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
			System.out.println(iS);
	}
}
