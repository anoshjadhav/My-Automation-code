package basicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class One {
	public static void main(String[] args) throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
	}
}
