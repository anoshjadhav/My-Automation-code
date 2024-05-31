package basicPopUp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class UsingAavilableMthod extends UtilityCLass {
	public static void main(String[] args) throws InterruptedException {
		OpenBrowser("chrome");
		dwsLgn();
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();	
		List<WebElement> addCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement web: addCart) {
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		Postcondition();
		driver.close();
	}
}
