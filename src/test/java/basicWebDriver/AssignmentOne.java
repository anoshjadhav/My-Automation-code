package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
public class AssignmentOne {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String acUrl = "https://demowebshop.tricentis.com/digital-downloads";
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		String cuUrl = driver.getCurrentUrl(); 
		String acTitle  = "Demo Web Shop. Digital downloads";   
		String cuTitle = driver.getTitle();
		Thread.sleep(2000);
		WebElement webele = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
		if (acUrl.equals(cuUrl)&&acTitle.contains(cuTitle)&&webele.isDisplayed()) {
			System.out.println("page is validate");
		}
		Thread.sleep(1000); 
		WebElement selectOp =  driver.findElement(By.id("products-orderby"));
		Select s = new Select(selectOp);
//		System.out.println(s.isMultiple());
		s.selectByIndex(1);
		s.selectByIndex(1);
		driver.quit();
	}
}
