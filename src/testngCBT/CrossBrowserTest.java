package testngCBT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	@Parameters("browserName")
	@Test
	public void cbt(String bName) throws InterruptedException {
		
		if(bName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();	
		}else if(bName.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}else if(bName.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("firstname")).sendKeys("Vaibhav");
		driver.findElement(By.name("lastname")).sendKeys("Kharat");
		driver.findElement(By.name("reg_email__")).sendKeys("9090909090");
		
		Thread.sleep(2000);
		driver.close();
		
			
		
	}

}
