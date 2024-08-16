package screenShotStudy;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeStramptudy {

	public static void main(String[] args) throws IOException {
		
	/*	String timeStramp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		//System.out.println(timeStramp);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\ScreenShotPract\\string"+timeStramp+"png");
		
		FileHandler.copy(src, dest);
	*/
		
		String timeStamp= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		System.out.println(timeStamp);

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("E:\\ScreenShotPract\\string"+timeStamp+".png");
		FileHandler.copy(src, dest);
		
	}

}
