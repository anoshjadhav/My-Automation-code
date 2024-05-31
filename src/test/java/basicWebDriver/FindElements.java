package basicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='radio']"));
//		for (WebElement webElement : ele) {
//			webElement.click();
//		}
		for (int i = 0; i < ele.size(); i++) {
			WebElement str = ele.get(i);
			str.click();
		}
		driver.close();
	}
}
