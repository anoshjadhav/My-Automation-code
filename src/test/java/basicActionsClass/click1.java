package basicActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		//create the object of action class
		//pass web Driver reference inside Actions Constructr 
		Actions ac = new Actions(driver);
//		identify the targeted element 
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
		//call nonstatic method which opration you want perform 
		Thread.sleep(1000);
		ac.click(button);
		//
		ac.perform();
		
		
	}
}
