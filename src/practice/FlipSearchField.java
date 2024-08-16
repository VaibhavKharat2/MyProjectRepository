package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipSearchField {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("motorola");
		Thread.sleep(15000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		System.out.println(list.size());
		
		Iterator<WebElement> it=list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next().getText());
		}
	}

}
