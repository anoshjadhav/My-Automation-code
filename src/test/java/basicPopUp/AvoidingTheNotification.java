package basicPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidingTheNotification {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		WebDriver driver = new ChromeDriver(op);
		op.addArguments("-disable-notifications");
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
	}
}
