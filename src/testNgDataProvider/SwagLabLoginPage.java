package testNgDataProvider;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabLoginPage {
	
	@Test(dataProvider = "idPass",dataProviderClass = testNgDataProvider.SwagLabCrediatial.class)
	public void f(String id, String pass) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("user-name")).sendKeys(id);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
		
		//assertNotEquals(driver.findElement(By.className("error-button")).getText(), "Wrong Crediantial,Please enter valid data");
		//Thread.sleep(2000);
		
	}

}
