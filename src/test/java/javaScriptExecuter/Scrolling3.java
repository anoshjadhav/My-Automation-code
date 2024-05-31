package javaScriptExecuter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
	
		driver.findElement(By.name("searchVal")).sendKeys("watch");
		driver.findElement(By.className("ic-search")).click();
		//down cast the reference
		JavascriptExecutor jsc =(JavascriptExecutor)driver;
		
//		driver.findElement(By.cssSelector("img[alt='Product image of TOMMY HILFIGER NCTH1791731 Water-Resistant Chronograph Watch']")).click()
		//click selected watch image
		for (; ;) {
			try {
				driver.findElement(By.cssSelector("img[alt='Product image of TOMMY HILFIGER NCTH1791731 Water-Resistant Chronograph Watch']")).click();
				break;
			} catch (NoSuchElementException e) {
				// TODO: handle exception
				jsc.executeScript("window.scrollBy(0,1000)");
			}
		}
		
	}
}
