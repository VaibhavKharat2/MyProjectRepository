import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("incognito");
		option.addArguments("disable-notifications");
	
		
		WebDriver driver = new ChromeDriver(option);
		Thread.sleep(2000);
		driver.get("https://www.justdial.com/");
		
		driver.findElement(By.xpath("//a[text()='Maybe Later']")).click();
		
	WebElement search=driver.findElement(By.cssSelector("input#main-auto"));
	search.sendKeys("watch");
	
	driver.findElement(By.xpath("//*[@id='srchbtn']")).click();
	Thread.sleep(500);
	
   File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
   
   File dest = new File("E:\\ScreenShotPract\\screen.png");
   
   FileHandler.copy(file, dest);
   System.out.println("1");
   
   
   
   
	}

}
