package testNgDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBookExcel {
	
	
	@Test(dataProvider = "familyMember", dataProviderClass = testNgDataProvider.Utility.class)
	public void Test(String fname,String lname,String mobNo) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(mobNo);
		
		Thread.sleep(2000);
		driver.close();
	}
	


	

}
