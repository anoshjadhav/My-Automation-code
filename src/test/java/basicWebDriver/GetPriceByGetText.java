package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPriceByGetText {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://demowebshop.tricentis.com/");
			WebElement Dd = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
			Dd.click();
		
			WebElement	price = driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div[1]/span"));
			System.out.println(price.getText());
			WebElement	price2 = driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div[1]/span"));
			System.out.println(price2.getText());
			WebElement	price3 = driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../../div[3]/div[1]/span"));
			System.out.println(price3.getText());
		}
}
