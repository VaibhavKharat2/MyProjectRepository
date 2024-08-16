package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathNopCommerse {

	public static void main(String[] args) throws InterruptedException {
		
		// login page code
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");
		System.out.println("1");
		
		driver.findElement(By.xpath("//input[@id='Email']"));  //.sendKeys("admin@yourstore.com");
		System.out.println("2");
		
		driver.findElement(By.xpath("//input[@id='Password']"));  //.sendKeys("admin");
		System.out.println("3");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("2");
		
		// customer list code
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='SearchEmail']")).sendKeys("Vaibhavkharat@123");
		System.out.println("2");
		Thread.sleep(300);
		
		driver.findElement(By.xpath(" //input[@id='SearchFirstName']")).sendKeys("Vaibhav");
		System.out.println("3");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@id='SearchLastName']")).sendKeys("Kharat");
		System.out.println("4");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@id='SearchRegistrationDateFrom']")).sendKeys("20-03-2000");
		System.out.println("5");
		Thread.sleep(300);
		
	
		driver.findElement(By.xpath("//input[@id='SearchRegistrationDateTo']")).sendKeys("10-04-2000");
		System.out.println("6");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@id='SearchLastActivityFrom']")).sendKeys("10-05-2000");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@id='SearchLastActivityTo']")).sendKeys("6-05-2001");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@id='SearchCompany']")).sendKeys("publisis saphient");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@id='SearchIpAddress']")).sendKeys("46464654");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	
	}

}
