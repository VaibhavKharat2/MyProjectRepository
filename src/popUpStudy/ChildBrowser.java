package popUpStudy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class ChildBrowser {
	


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth");
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='__email']")).sendKeys("vaibhavkharat");
		Thread.sleep(1000);
		

		
		//Here it opens the child page but its focus on main page only
		
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
	
		//It gives only main page it
		String mainPage=driver.getWindowHandle();
		System.out.println(mainPage);
		
		Set<String> id = driver.getWindowHandles();
		
//		ArrayList<String > al =new ArrayList<String>(id);
//		System.out.println(al.get(0));
//		System.out.println(al.get(1));
//		System.out.println(al.get(2));
		
		Iterator<String> it = id.iterator();
		String indeedPage = it.next();
		String googlePage = it.next();
		String applePage = it.next();
		
		driver.switchTo().window(googlePage);
		
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.id("identifierId")).sendKeys("vaibhav kharat");
		Thread.sleep(1000);
		
		driver.close();
		
		driver.switchTo().window(applePage);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='account_name_text_field']")).sendKeys("kharatvaibhav");
		
		Thread.sleep(1000);
	
		driver.close();
		
		Thread.sleep(1000);
		
		//driver.close();		NO SUCH A WINDOW EXCEPTION YOU HAVE TO SWITCH
		//FOCUS ON MAIN PAGE 
		
		driver.switchTo().window(indeedPage);
		
	
		
	}

}
