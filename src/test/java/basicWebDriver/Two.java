package basicWebDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class Two {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		driver.manage().window().fullscreen();
//		Thread.sleep(2000);
//		this methods used to find the and getting the height width of the web
//		org.openqa.selenium.Dimension a =  driver.manage().window().getSize();
//		System.out.println(a.getWidth()+""+a.getHeight());
//		it is used to manage the height and width
//		Dimension d1 = new Dimension(500,800);
//		driver.manage().window().setSize(d1);
		// point which is used to change the direction of the webpage 
//		Point a = driver.manage().window().getPosition();
//		System.out.println(a.getX());
//		System.out.println(a.getY());
		
		Point a = new Point(200,300);
		// which is used set the position
		driver.manage().window().setPosition(a);
 		 
		
		
	}
}
