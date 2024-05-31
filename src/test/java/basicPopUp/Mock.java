package basicPopUp;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			Thread.sleep(2000);
			
		
					driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("anosh");
					driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("anoshjadhav763@gmail.com");
					driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("ankit");
					driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("ankit43@gmail.com");
					driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("hello");
					driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
					driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("5");
					driver.findElement(By.id("add-to-cart-button-2")).click();
					Thread.sleep(3000);
			driver.navigate().back();
//					driver.findElement(By.partialLinkText("Books")).click();
//					Thread.sleep(1000);
//					driver.navigate().back();
//					driver.findElement(By.partialLinkText("Computers")).click();
//					Thread.sleep(1000);
//					driver.navigate().back();
//					driver.findElement(By.partialLinkText("Electronics")).click();
//					Thread.sleep(1000);
//					driver.navigate().back();
//					driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
//					Thread.sleep(1000);
//					driver.navigate().back();
//					driver.findElement(By.partialLinkText("Digital downloads")).click();
//					Thread.sleep(1000);
//					driver.navigate().back();
//					driver.findElement(By.partialLinkText("Jewelry")).click();
//					Thread.sleep(1000);
//					driver.navigate().back();
//					driver.findElement(By.partialLinkText("Gift Cards")).click();
//					Thread.sleep(1000);
//					driver.navigate().back();
			List<WebElement> eles = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
				for (WebElement web : eles) {
					web.click();
					driver.navigate().back();
				}
//			List<WebElement> text = driver.findElements(By.xpath("//ul[@class='poll-options']/li/label"));
//			for (WebElement web : text) {
//				web.click();
//				System.out.println(web.getText());
//			}
			Thread.sleep(6000);
	}
}
