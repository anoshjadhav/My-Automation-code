package basicActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTwo {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Actions act=new Actions(driver);
			
			Thread.sleep(2000);
//			String bookurl = "https://demowebshop.tricentis.com/books/";
			
//			if(driver.getCurrentUrl().equals(bookurl)) {
		
			WebElement computer = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
			act.keyDown(Keys.SHIFT).click(computer).build().perform();
			WebElement electronics = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
			act.keyDown(Keys.SHIFT).click(electronics).build().perform();
			WebElement Apparel = driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]"));
			act.keyDown(Keys.SHIFT).click(Apparel).build().perform();
			WebElement Digital_downloads = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
			act.keyDown(Keys.SHIFT).click(Digital_downloads).build().perform();
			WebElement Jewelry = driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]"));
			act.keyDown(Keys.SHIFT).click(Jewelry).build().perform();
			WebElement Gift_Cards = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
			act.keyDown(Keys.SHIFT).click(Gift_Cards).build().perform();
			driver.quit();
//		}
	}		
}
