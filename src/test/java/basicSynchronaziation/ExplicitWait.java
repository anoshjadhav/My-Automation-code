package basicSynchronaziation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
				driver.get("https://www.ajio.com/");
				String cUrl = driver.getCurrentUrl();
				System.out.println(cUrl);
			/*	if (cUrl.equals("https://www.ajio.com/")) {
					System.out.println("yes");
				}
				else {
					System.out.println("No!");
				}
			*/
				//1.step create the object webDriverwait class and we have to pass to webDriver referencce , time delay as an 
				//argument  to webDriverWait constructor
				WebDriverWait wd = new WebDriverWait(driver,Duration.ofSeconds(2));
				//2.step call utill method 
				//3.step pass predicate function alternative name is (predicate and the function is method)
				//as an argument to utill
				wd.until(ExpectedConditions.urlMatches(cUrl)); /*if the url not matched it will throw timeoutexcepion*/
				System.out.println("hello");
	}
}
