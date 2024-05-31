package basicWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCard {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://demowebshop.tricentis.com/");
			WebElement Dd = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
			Dd.click();
			WebElement addCart = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
			addCart.click();
			List<WebElement> reg = driver.findElements(By.xpath("//div[@class='giftcard']/div/input[@type='text']"));
			int i = 0;
			String[] str = {"anosh","ansoh@gmail.com","anosh","jadhav@gmail.com"};
//			System.out.println(reg.getFirst());
			for (WebElement webElement : reg) {
//				webElement.sendKeys(str[i]);
//				i++;
				System.out.println(webElement);
			}
			Thread.sleep(1000);
			driver.close();
		}
}
