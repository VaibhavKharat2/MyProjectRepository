package setSizeOfBrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionOfBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.manage().window().getPosition());
		
		Point p = new Point(500, -00);
		driver.manage().window().setPosition(p);

	}

}
