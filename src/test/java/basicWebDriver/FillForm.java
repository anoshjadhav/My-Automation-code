package basicWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FillForm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("anosh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("jadhav");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("tal . vaijapur dist sambhajinagar");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("anoshjadhav763@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7620254197");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		Thread.sleep(1000);
		WebElement tar = driver.findElement(By.xpath("//a[text()='Hindi']"));
		tar.click();
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement op = driver.findElement(By.id("Skills"));
		Select sc = new Select(op);
		sc.selectByValue("C++");
		WebElement op2 = driver.findElement(By.id("country"));
		Select sc2 = new Select(op2);
			sc2.selectByValue("India");
			WebElement yearselect = driver.findElement(By.id("yearbox"));
		Select year = new Select(yearselect);
		year.selectByValue("2003");
		WebElement monthselect = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select month = new Select(monthselect);
		month.selectByValue("March");
		WebElement dayselect = driver.findElement(By.id("daybox"));
		Select day = new Select(dayselect);
		day.selectByValue("24");
		
		driver.findElement(By.id("firstpassword")).sendKeys("anosh@123");
		driver.findElement(By.id("secondpassword")).sendKeys("anosh@123");
		Thread.sleep(6000);
		driver.close();
	}
}
