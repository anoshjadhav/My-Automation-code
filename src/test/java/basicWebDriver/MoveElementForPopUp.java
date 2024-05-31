package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElementForPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(right).build().perform();
		ac.contextClick().build().perform();
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		try {
			right.click();
			System.out.println("pop is not present");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("pop is present");
		}
		System.out.println("Script is successful");
		driver.close();
	}
}
