package testNGStudy;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {
	
	WebDriver driver;
	WebElement user_Id;
	WebElement pass;
	WebElement button;
	@BeforeClass 
	public void lounchBrowser() {
		 driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/v1/index.html");
		  driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void findElement() {
		
	 user_Id=driver.findElement(By.name("WebDriver driver"));
	 pass = driver.findElement(By.id("password"));
	 button =driver.findElement(By.className("btn_action"));
	}
	
  @Test
  public void f() throws InterruptedException {
	 
	  user_Id.sendKeys("standard_user");
	  pass.sendKeys("secret_sauce");
	  button.click();
	  Thread.sleep(2000);
	   
  }
  @AfterMethod
  public void logOut() throws InterruptedException {
	  driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("logout_sidebar_link")).click();
  }
  
  @AfterClass
  public void closeBrowser() {
	  driver.quit();
  }
}
