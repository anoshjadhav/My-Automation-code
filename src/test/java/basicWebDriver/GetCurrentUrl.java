package basicWebDriver;

//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
//		launch the application
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ajio.com");
		// this method used to capture the current page
		String url = driver.getCurrentUrl();
		System.out.println(url);
//		driver.findElement(By.name("searchVal")).sendKeys("perfumes");
//		driver.findElement(By.className("ic-search")).click();
//	}
}
}
