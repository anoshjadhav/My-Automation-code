package basicPopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DWSChildWindowClose {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.PAGE_DOWN);
		ac.build().perform();
		String ver = "https://demowebshop.tricentis.com/";
		if (ver.equals(driver.getCurrentUrl())) {
			Thread.sleep(1000);
			List<WebElement> lnk = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			String rss = "https://demowebshop.tricentis.com/news/rss/1";
			
			for (WebElement webElement : lnk) {
				webElement.click();
				if (rss.equals(driver.getCurrentUrl())) {
					driver.navigate().back();
				}
				Thread.sleep(1000);
			}
			
			Set<String> win = driver.getWindowHandles();
			int i = 0;
			for (String str: win) {
				driver.switchTo().window(str);
				if (i>0) {
					driver.close();
				}
				i++;
			}
		}
		else {
			System.out.println("Write the correct Url");
		}
		
	}
}
