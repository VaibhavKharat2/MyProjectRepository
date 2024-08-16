package iFrameStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelWebsite {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo");
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Vaibhav");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kharat");
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Kharat vaibhav");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("Vaibhav123@gmail.com");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#number")).sendKeys("21");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#demo")).click();
		
System.out.println("1");
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		System.out.println("1");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("vaibhavkharat");
		
//		 WebElement s = driver.findElement(By.xpath("//h1[text()='Demonstration']"));
//		 System.out.println(s.getText());
//		
//		WebElement text = driver.findElement(By.xpath("//h3[contains(text(),' for testing?')]"));	
//		
//		System.out.println(text.getText());
//		 
//		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 Thread.sleep(5000);
//		 driver.switchTo().frame("chat-widget");
//		 System.out.println("1");
//		 driver.findElement(By.xpath("//span[text()='Chat now']")).click();
//		 System.out.println("2");
		
		
		

	}

}
