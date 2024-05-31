package basicPopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TwitterScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		LocalDateTime date =  LocalDateTime.now();
		System.out.println(date);	
		String newDate = date.toString().replace(":", "-");
		System.out.println(newDate);
		ChromeOptions op = new ChromeOptions();
		WebDriver driver = new ChromeDriver(op);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://twitter.com/");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("anoshjadhav763@gmail.com");	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@data-testid='ocfEnterTextTextInput']")).sendKeys("@anosh28717");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anosh@129");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Search query']")).sendKeys("@amir_khan");
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//div[@data-testid='cellInnerDiv'][3]")).click();	
		driver.findElement(By.xpath("(//div[@class='css-175oi2r r-12181gd r-1pi2tsx r-13qz1uu r-o7ynqc r-6416eg r-1ny4l3l'])[1]")).click();		
		WebElement amir = driver.findElement(By.xpath("//img[@src='https://pbs.twimg.com/profile_images/253470138/Aamir-Khan-big_400x400.jpg']"));
		File from = amir.getScreenshotAs(OutputType.FILE);	
		File to = new File("C:\\Users\\HP\\eclipse-workspace\\selenium\\img\\amir.png");
		FileHandler.copy(from, to);
//		driver.findElement(By.className("css-175oi2r r-7q8q6z r-6koalj r-1777fci")).click();
		/*
<input aria-activedescendant="typeaheadFocus-0.08568116516918911" aria-autocomplete="list" aria-label="Search query" aria-owns="typeaheadDropdown-3" autocapitalize="sentences" autocomplete="off" autocorrect="off" placeholder="Search" role="combobox" spellcheck="false" enterkeyhint="search" type="text" dir="auto" class="r-30o5oe r-1dz5y72 r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-xyw6el r-13qz1uu r-fdjqy7" data-testid="SearchBox_Search_Input" value="">		 
		   */	
		//		TakesScreenshot ts =  (TakesScreenshot) driver;
//		File from = ts.getScreenshotAs(OutputType.FILE);
//		File to = new File(".\\img\\twitterph"+newDate+".png");
//		FileHandler.copy(from, to); 
	}
}
