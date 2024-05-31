package basicSynchronaziation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().fullscreen();
		Thread.sleep(10000);
		driver.get("https://naukari.com/");
		driver.findElement(By.id("login_Layer")).click();
		
		driver.findElement(By.cssSelector("input[palceholder='Enter your active Emiil ID / Username']")).sendKeys("anosh");
		
		
	}
}
