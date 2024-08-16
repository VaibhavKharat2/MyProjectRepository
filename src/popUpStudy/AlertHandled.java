package popUpStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandled {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		driver.findElement(By.name("cusid")).sendKeys("42222");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
		alt.dismiss();
		System.out.println(alt.getText());
		
		alt.accept();
		
		
		
		Thread.sleep(500);
		
		
	}

}
