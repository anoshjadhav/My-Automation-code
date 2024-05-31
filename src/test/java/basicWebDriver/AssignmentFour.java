package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFour {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String acUrl = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com");
		String cuUrl = driver.getCurrentUrl();
		if (acUrl.contains(cuUrl)) {
			System.out.println("Dws Verify");
		}
		String acTitle="Demo Web Shop. Digital downloads";
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		String cuTitle=driver.getTitle();
		if (acTitle.contains(cuTitle)) {
			System.out.println("Title is verify");
		}
		WebElement selectOp =  driver.findElement(By.id("products-orderby"));
		Select s = new Select(selectOp);
		s.selectByIndex(1);
//		s.selectByIndex(1);
		driver.quit();
		
	}
}
