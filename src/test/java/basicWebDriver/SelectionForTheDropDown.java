package basicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionForTheDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		WebElement	sRef = driver.findElement(By.id("products-orderby"));
		Select s = new Select(sRef);
	      List <WebElement> op= s.getOptions();
		int i = 0;
		for (WebElement string : op) {
			System.out.println(string);
			sRef.findElement(By.id("products-orderby"));
			s=new Select(sRef);
			s.selectByIndex(i+1);
		}
	}
}
