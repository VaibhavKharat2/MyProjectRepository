package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 14");
		Thread.sleep(4000);
		
		
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc']/li"));
		
		System.out.println(list.size());
		
//		for(WebElement l1:list) {
//			
//			System.out.println(l1.getText());
//		}
		System.out.println("1");
		
		for(int i=0; i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			System.out.println("2");
		}

	}

}
