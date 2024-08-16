package iFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeStudy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		Thread.sleep(500);
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText());
			
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
//		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Ch
//				ild Iframe</p>']")));
		
		System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page.')]")).getText());
	}

}
