package testngVerification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalseStudy {
	

	@Test
	public void faceBook() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement gender=driver.findElement(By.xpath("(//input[@class='_8esa'])[3]"));
	
		boolean result= gender.isDisplayed();
		
		Assert.assertFalse(result);
		
		
		
		
		
		//it gives valid result for testng
	
		//It will not failed test case
//		if(result == false) {
//			Reporter.log("pass test case",true);
//		}else {
//			Reporter.log("pass test case",true);
//		}
	}

}
