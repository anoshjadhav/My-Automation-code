package basicPopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement rigthClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		ac.contextClick(rigthClick).build().perform();
		List<WebElement> eles = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		String e  = "Edit";
		String c = "cut";
		String copy = "copy";
		String p = "paste";
		String d = "Delete";
		for (WebElement web : eles) {
			if (e.equalsIgnoreCase(web.getText())) {
				web.click();
				driver.switchTo().alert().accept();
				Thread.sleep(1500);
				ac.contextClick(rigthClick).build().perform();
				Thread.sleep(2500);
			}
			else if (c.equalsIgnoreCase(web.getText())) {
				web.click();
				driver.switchTo().alert().accept();
				Thread.sleep(1500);
				ac.contextClick(rigthClick).build().perform();
				Thread.sleep(2500);
			}
			else if (copy.equalsIgnoreCase(web.getText())) {
				web.click();
				driver.switchTo().alert().accept();
				Thread.sleep(1500);
				ac.contextClick(rigthClick).build().perform();
				Thread.sleep(2500);
			}
			else if (p.equalsIgnoreCase(web.getText())) {
				web.click();
				driver.switchTo().alert().accept();
				Thread.sleep(1500);
				ac.contextClick(rigthClick).build().perform();
				Thread.sleep(1500);
			}	
			else if (d.equalsIgnoreCase(web.getText())) {
				web.click();
				driver.switchTo().alert().accept();
				Thread.sleep(1500);
				break;
			}	
		}
		Thread.sleep(2000);
		driver.close();
	}
}
