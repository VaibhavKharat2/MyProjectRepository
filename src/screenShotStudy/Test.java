package screenShotStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\ScreenShotPract\\study.png");
		
	
		FileHandler.copy(file, dest);
		
		
		
	}

}
