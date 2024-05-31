package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukari {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("anosh");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("anosh@123");
//		driver.findElement(By.xpath("//label[text()='Men']")).click();
	}
}
