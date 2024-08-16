package a_FullSeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v123.media.model.Timestamp;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class ScreenShotStudy {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//timestamp

		//To take different String text
		
		String time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		System.out.println(time);
		
		//String text=RandomString.make(3);
		File dest = new File("D:\\MXShare\\SsStudy"+time+".png");
		
		FileHandler.copy(src, dest);
		


	}

}
