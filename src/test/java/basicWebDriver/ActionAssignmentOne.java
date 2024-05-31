package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionAssignmentOne {
	public static void main(String[] args) throws InterruptedException {
		
				// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				Actions act=new Actions(driver);
				Thread.sleep(2000);
				String title = "Demo Web Shop. Register";
				
				
				act.keyDown(Keys.TAB).build().perform();
				Thread.sleep(1000);
				act.keyDown(Keys.TAB).build().perform();
				Thread.sleep(1000);
				act.keyDown(Keys.ENTER).build().perform();
				Thread.sleep(1000);
				if(driver.getTitle().equals(title)) {
				driver.findElement(By.id("gender-male")).click();
				act.keyDown(Keys.TAB).sendKeys("anosh").build().perform();
				Thread.sleep(1000);
				act.keyDown(Keys.TAB).sendKeys("jadhav").build().perform();
				Thread.sleep(1000);
				act.keyDown(Keys.TAB).sendKeys("anoshjadhav763@gmail.com").build().perform();
				Thread.sleep(1000);
				act.keyDown(Keys.TAB).sendKeys("anosh18").build().perform();
				Thread.sleep(1000);
				act.keyDown(Keys.TAB).sendKeys("anosh18").build().perform();
				Thread.sleep(1000);
				act.keyDown(Keys.TAB).build().perform();
				Thread.sleep(1000);
				act.keyDown(Keys.ENTER).build().perform();
				}
				else {
					System.out.println("page title is wrong pls correct it");
				}
			driver.close();
	}
}

