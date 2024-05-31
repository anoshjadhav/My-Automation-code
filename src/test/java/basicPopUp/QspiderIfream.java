package basicPopUp;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class QspiderIfream {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Multiple iframe")).click();
		Thread.sleep(1500);
		driver.switchTo().frame(0);
		Thread.sleep(2500);
		driver.findElement(By.id("email")).sendKeys("anoshjadhav763@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Anosh@129");
		driver.findElement(By.id("confirm-password")).sendKeys("Anosh@129");
		Thread.sleep(2500);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		Thread.sleep(2500);
		driver.findElement(By.id("username")).sendKeys("anosh jadhav");
		driver.findElement(By.id("password")).sendKeys("anosh@129");		
	}
}
