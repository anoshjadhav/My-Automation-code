package basicActionsClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovering4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ajio.com");
		//create the action class for performing the action on the webpage
		Actions ac = new Actions(driver);
		//adjust the screen
		driver.manage().window().fullscreen();
		ac.moveByOffset(200,300).contextClick().build();
		
		// this method fnally performing the action on the webpage.
		ac.perform();
	}
}
