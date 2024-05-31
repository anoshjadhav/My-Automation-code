package basicWebDriver;

//import or.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.interactions.Actions;

public class YouTube {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
		
			for (int i = 0; i < 1; i++) {
				driver.navigate().refresh();
				Thread.sleep(3000);
			}
		}
}
