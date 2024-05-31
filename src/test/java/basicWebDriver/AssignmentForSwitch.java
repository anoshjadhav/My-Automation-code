package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentForSwitch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(1000);
		
		//		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		
		Set<String> multi = driver.getWindowHandles();
		int i = 0;
		String fUrl = "https://www.facebook.com/nopCommerce";
//		multi.remove(fUrl)
		for (String str : multi) {
			String cUrl = driver.getCurrentUrl();
			if (cUrl.contains(fUrl)) {
				driver.switchTo().window(str);
				driver.navigate().back();
				System.out.println("hi");
				driver.findElement(By.xpath("(//input[@class='x1i10hfl xggy1nq x1s07b3s x1kdt53j x1a2a7pz xjbqb8w x1ejq31n xd10rxx x1sy0etr x17r0tee x9f619 xzsf02u x1uxerd5 x1fcty0u x132q4wb x1a8lsjc x1pi30zi x1swvt13 x9desvi xh8yej3 x15h3p50 x10emqs4'])[1]")).sendKeys("anoshjadhav763@gmail.com");
//				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				break;
			}
			i++;
		}
	}
}
