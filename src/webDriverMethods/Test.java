package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		// 1) get -- to get the url , for to open the application
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");// to open the url
		
		Thread.sleep(1000);
		
		// 2)-- close() -- to close the current tab of the browser open by selenium
		
		//driver.close();
		
		WebElement openTab = driver.findElement(By.id("opentab"));
		openTab.click();
		System.out.println("1");
		
		Thread.sleep(1000);
		
		driver.quit();

	}

}
