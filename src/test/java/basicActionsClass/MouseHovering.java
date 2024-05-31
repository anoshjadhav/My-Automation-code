package basicActionsClass;

//import java.awt.Desktop.Action;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
public class MouseHovering {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://ajio.com");
		Actions ac = new Actions(driver);	
		
		WebElement a = driver.findElement(By.xpath("//span[text()='MEN']"));
//		call nonStatic mehtod - moveToElement(WebElement targeted)
	   ac.moveToElement(a);
	   // call perform
	   ac.perform();
		
	}
}
