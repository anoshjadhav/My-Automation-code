package basicWebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigate {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ajio.com/search/?text=perfums");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
