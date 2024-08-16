package iFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeStudy {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(300);
		
		//NoSuchElementException - if we not move focus to iframe
		
		//to switch the focus on child frame
		
		driver.switchTo().frame("courses-iframe");
		String text=driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']")).getText();
		
		System.out.println(text);
		
		// to take action again on main page, we need to switch selenium focus from
		// frame to main page
		//driver.switchTo().parentFrame();  immediate parent
		
		driver.switchTo().defaultContent(); //main page
		
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();

	}

}
