package basicWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.navigate().to("https://www.ajio.com");
		driver.findElement(By.name("searchVal")).sendKeys("watches");
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.cssSelector("img[alt='Product image of French Connection Men Water-Resistant Analogue Watch-FCP41SM'")).click();
//		it only close the parent window
		driver.close();
	}
}
