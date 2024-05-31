package basicSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
    public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/singup");
		// step 1 : - idenitfy the taragated dropDown  
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		// step 2 : - create the object of select class 
		// step 3: - in select constructor pass targated dropdown 
		// step 4: - call non static method
		//s.selectByVisibleText("marach");
//		we can also use another method call selectByValue("");
//		s.selectByValue("11");// it select with help of the select By Value; 
//		it will select the element with help of the index
//		s.selectByIndex(1);
		System.out.println(s.isMultiple());
	}
}
