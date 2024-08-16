package locatorStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		
	}

}

/*
public static void main(String[] args) { 
WebDriver driver= new ChromeDriver(); 
driver.get("https://www.facebook.com/signup"); 
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Velocity");
*/