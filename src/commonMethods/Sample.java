package commonMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		Utility.screenShot(driver, "SampleClass");
		
		WebElement ele=driver.findElement(By.xpath("//span[text()=' Meta © 2024']"));
		
		Utility.scrollDown(driver, ele);
		
		Utility.screenShot(driver, "scroll");  
		
		String path = "C:\\Users\\ASUS\\OneDrive\\Documents\\ViShuBhav.xlsx";
		
		String id = Utility.dataFromExcell(path, "Sheet5", 0, 0);
		String pass = Utility.dataFromExcell(path, "Sheet5", 0, 1);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(id);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		
		
		
		
		
		
		
		
		
		
	}

}
