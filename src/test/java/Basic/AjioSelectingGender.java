package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioSelectingGender {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("watch");
		driver.findElement(By.className("rilrtl-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("lebal[contains(text(),'MEN')]")).click();
	
	}
}
