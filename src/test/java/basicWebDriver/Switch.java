package basicWebDriver;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.navigate().to("https://www.ajio.com");
		driver.findElement(By.name("searchVal")).sendKeys("watches");
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.cssSelector("img[alt='Product image of LACOSTE 2001081 Water-Resistant Analogue Watch']")).click();
//		to transfer the driver control parent window to child window
//		step 1. how many window/tab are there
		Set<String> str= driver.getWindowHandles();
		// step 2 : forEach loop when we have multiple windows / tab
	
	
		for (String string : str) {
			String allurl = driver.switchTo().window(string).getCurrentUrl();
		 	String childurl = "https://www.ajio.com/skylona-skm-9180-analogue-watch-with-deployant-clasp-/p/466296274_black";
			if (allurl.contains(childurl)) {
		 		break;
			}
		}
	
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
//		for (String str1 : str) {
//			String allurl = driver.switchTo().window(str1).getCurrentUrl();
//		 	String parenturl = "https://www.ajio.com/s/watches-3991-60341?query=:relevance&classifier=intent";
//			if (allurl.contains(parenturl)) {
//		 		break;
//			}
//		}
//		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	}
	
}
