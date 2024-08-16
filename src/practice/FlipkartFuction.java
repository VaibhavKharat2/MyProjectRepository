package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartFuction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("motorola");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]")).click();
		
		
		
	}

}
