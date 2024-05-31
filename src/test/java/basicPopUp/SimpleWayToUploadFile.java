package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWayToUploadFile {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(1000);
		WebElement in = driver.findElement(By.xpath("//input[@type='file']"));
		in.sendKeys("C:\\anosh\\fileupload.docx");
	}
}
