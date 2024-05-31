package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		//assignment
		// lunch the URl
		//click on the sign up
		//enter Information and click on agree(select the check box);
		// finally sing up 
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("fullName")).sendKeys("Anosh Ramdas jadhav");
		
		
	}

}
