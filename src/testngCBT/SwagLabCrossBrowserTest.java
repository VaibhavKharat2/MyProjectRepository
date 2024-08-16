package testngCBT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SwagLabCrossBrowserTest {
	
	WebDriver driver;
	
	@Parameters("browserName")
	@Test
	public void f(String bName) throws InterruptedException {
		
		if(bName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(bName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(bName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
