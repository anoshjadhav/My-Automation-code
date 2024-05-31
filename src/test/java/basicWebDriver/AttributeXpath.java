package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String acUrl = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String cuUrl = driver.getCurrentUrl();
	
		if (acUrl.contains(cuUrl)) {
			System.out.println("verify");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();
			driver.navigate().back();
		}
		else {
			System.out.println("Not Match");
		}
		driver.close();
	}
}
