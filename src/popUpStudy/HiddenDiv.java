package popUpStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiv {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("commonModal__close")).click();
		
		
		// ElementClickInterceptedException
		//If you are not handled the hiddendiv popup then you above exception
		driver.findElement(By.xpath("(//span[text()='Hotels'])[1]")).click();

	}

}
