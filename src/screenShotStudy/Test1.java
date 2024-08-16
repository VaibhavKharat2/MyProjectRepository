package screenShotStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Test1 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(3);
		
		//it can use to giver different name to the image 
		//as if the image name is same then that we be updated
		
		File dest = new File("E:\\ScreenShotPract\\string" +random+".png");
		
		FileHandler.copy(src, dest);
		
	}

}
