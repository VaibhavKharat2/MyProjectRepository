package a_FullSeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScroolDownAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement ele = driver.findElement(By.xpath("(//div[contains(text(),'Download Paytm App')])[1]"));
		Actions act = new Actions(driver);
		
		act.scrollToElement(ele).perform();
		Thread.sleep(1000);
		act.scrollByAmount(0, 0).perform();
	}

}
