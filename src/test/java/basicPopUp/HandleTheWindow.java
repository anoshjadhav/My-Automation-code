package basicPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTheWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Downloads/MultipleWindow%20(1).html");
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(2500);
		Set<String> handls = driver.getWindowHandles();
		int i = 0;
		for (String str: handls) {
			if (i>0) {
				driver.switchTo().window(str);
				driver.manage().window().maximize();
				
			}
			i++;
		}
		for (String string : handls) {
			if (i>0) {
				driver.switchTo().window(string);
				driver.close();		
			}
			i++;
		}
		System.out.println(handls);
	}
}
