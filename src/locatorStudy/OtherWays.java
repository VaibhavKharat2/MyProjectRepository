
package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherWays {
	
public static void main(String[] args) throws InterruptedException {
		

	WebDriver driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");
	
	//------------- locator by id
	WebElement email = driver.findElement(By.id("Email"));
	email.clear();
	email.sendKeys("vaibhav kharat");
	Thread.sleep(2000);
		
	//------- locator by name
		WebElement pass = driver.findElement(By.name("Password"));
		pass.clear();
		pass.sendKeys("kharat@21542");
		Thread.sleep(2000);
		
		//WebElement logIn = driver.findElement(By.className("email valid"));
		//logIn.click();
		
}
}