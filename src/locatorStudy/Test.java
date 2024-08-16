package locatorStudy;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class Test {
	
	 public static void main(String[] args)  throws IOException, InterruptedException{
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 String URL = driver.getCurrentUrl();
		 System.out.println(URL);
		if(URL.equals("https://www.facebook.com/"))
		{
			System.out.println("pass");
		}
		else 
			{
				System.out.println("fails");
			}
		
	    WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	    username.sendKeys("atulgholap8@gmail.com");
	   
	    WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
	   pass.sendKeys("atul@1995");
	   WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	   login.click();
	   WebElement search = driver.findElement(By.xpath("//label[contains(@class,'br7hx15l h2jyy9rg')]"));
	   search.click();
	   WebElement freindname = driver.findElement(By.xpath("//input[@aria-label='Search Facebook']"));
	   freindname.sendKeys("vishal kharat");
	   Thread.sleep(3000);
	   WebElement selectsearch = driver.findElement(By.xpath("(//i[@class='hu5pjgll eb18blue'])[1]"));
	   selectsearch.click();
	   Thread.sleep(5000);
	   WebElement selectsearch1 = driver.findElement(By.xpath("(//div[@aria-label='Add Friend'])[1]"));
	   selectsearch1.click();
	   /*Thread.sleep(5000);
	   WebElement Addfreind = driver.findElement(By.xpath("(//span[text()='Add Friend'])[1]"));
	   Addfreind.click();
	   WebElement canclerequest = driver.findElement(By.xpath("((//span[text()='Cancel Request'])[1]"));
	   canclerequest.click();*/
}
}


