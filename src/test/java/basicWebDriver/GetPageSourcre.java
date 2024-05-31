package basicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourcre {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ajio.com/search/?text=perfums");
//		this method used to get the current webpage source code
		String source = driver.getPageSource();
		System.out.println(source);
	}
}
