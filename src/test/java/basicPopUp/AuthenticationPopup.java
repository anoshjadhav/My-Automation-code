package basicPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthenticationPopup {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		//we directly passing the username and password 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
