package testNgDataProvider;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PropertiesFileSwagLabLogin {
	
	@Test
	public void loginSwagLabUsingPropertyFile() throws IOException, InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("user-name")).sendKeys(PropertyFileUtilityClass.readDataFromPropertyFile("UserId"));
		driver.findElement(By.name("password")).sendKeys(PropertyFileUtilityClass.readDataFromPropertyFile("PassWord"));
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
