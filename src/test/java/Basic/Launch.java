package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("anoshjadhav");
		driver.findElement(By.className("_2iLD__")).click();

		

	}

}
