package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmezonTask {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_"
				+ "e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw="
				+ "g&hvrand=1829782725107095187&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy="
				+ "9075377&hvtargid=kwd-316976912080&hydadcr=5841_2362028");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("motorola edge 50 new");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	///	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		act.scrollByAmount(10, 200).perform();
		
		driver.findElement(By.xpath("(//h2/a/span)[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		
		String main=it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		
		act.scrollByAmount(10, 500).perform();
		
		driver.findElement(By.xpath("(//input[@name='submit.buy-now'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	WebElement	email=driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("kvttar@gmail.com");
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	driver.findElement(By.xpath("//span[@id='continue']")).click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	//Proceed to create account page
	
	driver.findElement(By.xpath("//input[@class='a-button-input']")).click();	
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
	
	driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("0000000000");
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
	
	driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Vaibhav Kharat");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1212112");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
	
	driver.findElement(By.xpath("//input[@id='continue']")).click();

	}
}
