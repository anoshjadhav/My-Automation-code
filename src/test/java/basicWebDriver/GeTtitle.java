package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeTtitle {
	public static void main(String[] args) {
//		launch the application
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ajio.com");
		// to get the current title of the page
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("searchVal")).sendKeys("prefums");
		driver.findElement(By.className("ic-search")).click();
		}
	}
