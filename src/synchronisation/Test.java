package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	public void main() {
	WebDriver driver = new ChromeDriver();
	
	//implicit wait applicable for a page
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	//explicitly wait applicable for a perticular elements
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1500));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(null)));
	
	//Fluent wait for single element


FluentWait<WebDriver> w1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(15000)).
pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchMethodException.class);
	
w1.until(ExpectedConditions.elementToBeClickable(By.xpath("")));


	
	
	}

}
