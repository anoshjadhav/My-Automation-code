package basicPopUp;
import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UtilityCLass {
	public static WebDriver driver;
	public static void OpenBrowser(String vlaue) {
		if ("chrome".equalsIgnoreCase(vlaue)) {
			driver  = new ChromeDriver();
		}
		else if ("fire".equalsIgnoreCase(vlaue)) {
			driver  = new FirefoxDriver();
		}
		else{
			driver  = new EdgeDriver();
		}
	}
	public static Actions actions(String s) {
		Actions ac = null;
		if (s.equalsIgnoreCase("action")) {
			 ac = new Actions(driver);
		}
		return ac;
	}
	public static void dwsLgn() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("jadhavanosh763@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Anosh@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();		
	}
	public static void Postcondition() {
		System.out.println("script successful");
	}
}
