package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleOne {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.navigate().to("https://www.ajio.com");
		driver.findElement(By.name("searchVal")).sendKeys("watches");
		driver.findElement(By.className("ic-search")).click();
//		this method we used to know the how many window are opened
//		to capture the current id of the window in the console
		driver.findElement(By.cssSelector("img[alt='Product image of French Connection Men Water-Resistant Analogue Watch-FCP41SM'")).click();
		String id = driver.getWindowHandle();
//		below we print the id of the window
		System.out.println(id);
	}
}
