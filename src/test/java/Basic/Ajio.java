package Basic;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ajio {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ajio.com/");
			
			for (int i = 0; i < 5; i++) {
				driver.get("https://www.ajio.com/");
				driver.findElement(By.name("searchVal")).sendKeys("Personal Product");
				driver.findElement(By.className("rilrtl-button")).click();
				Thread.sleep(1000);				
			}
		}
}
